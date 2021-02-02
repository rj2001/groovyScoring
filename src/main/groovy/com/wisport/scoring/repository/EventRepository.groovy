package com.wisport.scoring.repository

import com.wisport.scoring.definition.Event
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface EventRepository extends JpaRepository<Event, String> {
    List<Event> findAll()

    Event findByEventId( String eventId)
    Event findByShortName(String shortName)

    @Query(nativeQuery = true, value = "SELECT * FROM EVENT WHERE EVENT_ID LIKE :seasonYear%")
    List<Event> findBySeason(@Param("seasonYear") Integer year)

}