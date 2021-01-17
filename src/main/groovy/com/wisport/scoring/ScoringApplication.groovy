package com.wisport.scoring

import com.wisport.scoring.external.DatabaseHandler
import com.wisport.scoring.repository.MemberRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class ScoringApplication {

	@Autowired
	static MemberRepository testRepository

	static void main(String[] args) {
		SpringApplication.run(ScoringApplication, args)

//		ProcessResults processedResults = new ProcessResults()
//		processedResults.processResults(
		DatabaseHandler test = new DatabaseHandler()
		test.testConnection()


		println( testRepository.findByLastName( "Arnold" ).toString(  ) )
	}

}
