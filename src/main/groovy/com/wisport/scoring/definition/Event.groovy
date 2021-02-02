package com.wisport.scoring.definition


import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table
import java.sql.Date

@Entity
@Table( name = "event")
class Event {
    @Id
    String eventId
    String shortName
    String fullName
    EventType eventType
    String addressLine1
    String addressLine2
    String city
    String state
    String zipcode
    Date startDateTime
    String url
    String contactName
    String contactEmail
    String contactPhoneNumber
    String socialMediaLink
    String courseLink
    String locationMap
}
