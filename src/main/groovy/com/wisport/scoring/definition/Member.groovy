package com.wisport.scoring.definition

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table
import java.sql.Date

@Entity
@Table(name="member")
class Member {
    @Id
    String wisportId
    String lastName
    String firstName
    Gender gender
    Integer yearOfBirth
    Integer teamId
    Date firstRegisteredDate
    Date lastRegisteredDate
    Date createdDate
    Date lastUpdatedDate
}
