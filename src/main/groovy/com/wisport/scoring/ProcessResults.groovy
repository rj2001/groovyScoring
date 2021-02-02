package com.wisport.scoring

import com.wisport.scoring.definition.Gender
import com.wisport.scoring.definition.Result

import java.sql.Date
import java.sql.Time

class ProcessResults {
    public void processResults( String filename, Integer eventId) {
        parseResultsFile( filename, eventId )

    }

    List<Result> parseResultsFile ( String file, Integer eventId) {
        List<Result> resultsList = [ ]
        new File( "src/main/resources/Results/$file" ).eachLine { line ->
            List<String> resultObject = line.split( "," )
            Result thisResult = new Result(
                    eventId,
                    resultObject[5],            // memberId
                    resultObject[0],            // lastName
                    resultObject[1],            // firstName
                    resultObject[4] as Integer, // age
                    resultObject[2] as Gender,  // gender
                    1 as Integer,               // default teamId
                    resultObject[6] as Integer, // overallPlace
                    resultObject[8] as String   // finishTime
            )
            resultsList.push( thisResult )
            println( resultsList.toString(  ) )
        }
        resultsList
    }
}
