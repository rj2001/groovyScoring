package com.wisport.scoring.repository

import com.wisport.scoring.definition.Member
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface MemberRepository extends JpaRepository<Member, String> {
    List<Member> findAll()
    Member findByWisportId(String wisportId)
    List<Member> findByTeamId(Integer teamId)

    @Query("SELECT m FROM Member m WHERE LAST_NAME = :lastName")
    List<Member> findByLastName(@Param("lastName") String lastName)

}