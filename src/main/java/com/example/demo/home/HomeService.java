package com.example.demo.home;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class HomeService {
	private final HomeRepository homeRepository;

	public String greeting(String lang) {
		Greeting greeting = homeRepository.findByLangCode(lang)
			.orElseThrow(() -> new RuntimeException("해당 언어 코드가 존재하지 않습니다."));

		return greeting.getMessage();
	}
}
