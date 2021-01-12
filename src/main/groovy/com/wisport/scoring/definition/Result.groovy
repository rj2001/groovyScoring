package com.wisport.scoring.definition

import java.sql.Date

class Result {
    Integer resultId
    String eventId
    String racerLastName
    String racerFirstName
    Integer racerAge
    Enum<String> gender
    Integer overallPlace
    Date finishTime
}
