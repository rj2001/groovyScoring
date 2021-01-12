package com.wisport.scoring.definition

import java.sql.Date

class Racer {
    String racerId
    String lastName
    String firstName
    Enum<String> gender
    Integer age
    Date createdDate
    Date lastUpdated
}
