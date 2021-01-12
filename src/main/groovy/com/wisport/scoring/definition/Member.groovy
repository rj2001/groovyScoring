package com.wisport.scoring.definition

import java.sql.Date

class Member {
    String wisportId
    String lastName
    String firstName
    Enum<String> gender
    Integer yearOfBirth
    Integer teamId
    Date firstRegisteredDate
    Date lastRegisteredDate
    Date createdDate
    Date lastUpdatedDate
}
