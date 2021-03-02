package com.wisport.scoring

import com.wisport.scoring.definition.Gender
import com.wisport.scoring.definition.Result
import com.wisport.scoring.repository.ResultRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ProcessResults {

    @Autowired
    ResultRepository resultRepository

    public void processResults( String filename, Integer eventId) {
        parseResultsFile( filename, eventId )

    }

    List<Result> parseResultsFile ( String file, Integer eventId ) {
        List<Result> resultsList = [ ]
        new File( "src/main/resources/Results/$file" ).eachLine { line ->
            List<String> resultObject = line.split( "," )
            Result thisResult = new Result(
                    eventId,                            // eventId passed in
                    resultObject[5],                    // memberId
                    resultObject[0],                    // lastName
                    resultObject[1],                    // firstName
                    setAgeGroupId( resultObject[4] ),   // age
                    resultObject[2] as Gender,          // gender
                    1 as Integer,                       // default teamId
                    resultObject[6] as Integer,         // overallPlace
                    resultObject[8] as String           // finishTime
            )
            resultsList.push( thisResult )
            println( resultsList.toString(  ) )
        }
        resultsList
        saveResults( resultsList )
    }

    void saveResults( List<Result> results ) {

//        results.each {
//            resultRepository.save( it )
//        }
        resultRepository.saveAll( results )
    }

    // TODO - Implement
    int setAgeGroupId(String dob) {
        return 0
    }
}
