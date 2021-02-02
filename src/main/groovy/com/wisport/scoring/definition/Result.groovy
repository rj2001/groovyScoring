package com.wisport.scoring.definition

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table
import java.sql.Date
import java.sql.Time

@Entity
@Table( name = 'result')
class Result {
    @Id
    Integer resultId
    String eventId
    String racerId
    String racerLastName
    String racerFirstName
    Integer racerAge
    Gender gender
    Integer teamId
    Integer overallPlace
    String finishTime

    Result (eventId, racerId, racerLastName, racerfirstName, racerAge, gender, teamId, overallPlace, finishTime){
        this.resultId = resultId
        this.eventId = eventId
        this.racerId = racerId
        this.racerLastName = racerLastName
        this.racerFirstName = racerfirstName
        this.racerAge = racerAge
        this.gender = gender
        this.teamId = teamId
        this.overallPlace = overallPlace
        this.finishTime = finishTime
    }
}
