package com.wisport.scoring.external

import java.sql.*
import groovy.sql.*

class DatabaseHandler {
    public static void testConnection(){
        def sql = Sql.newInstance('jdbc:mysql://localhost:3306/wisport',
                'rjochmann', 'Fizzgig74#')

        // Executing the query SELECT VERSION which gets the version of the database
        // Also using the eachROW method to fetch the result from the database

//        sql.eachRow('SELECT VERSION()'){ row ->
//            println row[0]
//        }
        def sqlstr = """CREATE TABLE IF NOT EXISTS MEMBER ( 
         WISPORT_ID INT NOT NULL,
         FIRST_NAME CHAR(20) NOT NULL,
         LAST_NAME CHAR(20) NOT NULL,
         BIRTH_YEAR INT NOT NULL,
         GENDER CHAR(1) NOT NULL,
         TEAM_ID INT NOT NULL,
         PRIMARY KEY (WISPORT_ID))"""

        sql.execute(sqlstr);
        sql.close()
    }
    // TODO: CRUD methods for Data Objects (Create,Read,Update,Delete) - Members, Racers, Results, Events, Teams, Scores
}
