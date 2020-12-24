package com.wisport.scoring.external

class DatabaseHandler {
    public void testConnection(){
        def sql = Sql.newInstance('jdbc:mysql://localhost:3306/rj2001_wi-prod',
                'localhost', 'PASSWORD', 'com.mysql.jdbc.Driver')

        // Executing the query SELECT VERSION which gets the version of the database
        // Also using the eachROW method to fetch the result from the database

        sql.eachRow('SELECT VERSION()'){ row ->
            println row[0]
        }

        sql.close()
    }
    // TODO: CRUD methods for Data Objects (Create,Read,Update,Delete) - Members, Results, Events, Scores
}