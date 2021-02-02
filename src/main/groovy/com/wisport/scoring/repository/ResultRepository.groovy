package com.wisport.scoring.repository

import com.wisport.scoring.definition.Result
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface ResultRepository extends JpaRepository<Result, String> {
    List<Result> findAll()

    List<Result> findByEventId( String eventId)
    List<Result> findByTeamId(Integer teamId)
    Result findByRacerId(String racerId)
//
//    @Query("SELECT r FROM Resl r WHERE LAST_NAME = :lastName")
//    List<Result> findByLastName(@Param("lastName") String lastName)

}