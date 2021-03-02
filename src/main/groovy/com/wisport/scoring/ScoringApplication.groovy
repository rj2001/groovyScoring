package com.wisport.scoring

import com.wisport.scoring.repository.MemberRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Configuration

@SpringBootApplication
class ScoringApplication {

	@Autowired
	MemberRepository testRepository

	@Autowired
	ProcessResults processResults

	public static void main(String[] args) {
		SpringApplication.run(ScoringApplication, args)

		//processResults.parseResultsFile(  "FlambeauTT.csv", 202021 )
	}

}
