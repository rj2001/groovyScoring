package com.wisport.scoring

import com.wisport.scoring.external.DatabaseHandler
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class ScoringApplication {

	static void main(String[] args) {
		SpringApplication.run(ScoringApplication, args)

		ProcessResults processedResults = new ProcessResults()
		processedResults.processResults()
		DatabaseHandler test = new DatabaseHandler()
		test.testConnection()
	}

}
