package com.wisport.scoring

import com.wisport.scoring.repository.MemberRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Configuration

@SpringBootApplication
class ScoringApplication {

	@Autowired
	static MemberRepository testRepository

	static void main(String[] args) {
		SpringApplication.run(ScoringApplication, args)

		ProcessResults processedResults = new ProcessResults()
		processedResults.parseResultsFile(  "FlambeauTT.csv", 202021 )
	}

}
