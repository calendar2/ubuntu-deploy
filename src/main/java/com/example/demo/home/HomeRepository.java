package com.example.demo.home;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeRepository extends JpaRepository<Greeting, Long> {
	Optional<Greeting> findByLangCode(String lang);
}
