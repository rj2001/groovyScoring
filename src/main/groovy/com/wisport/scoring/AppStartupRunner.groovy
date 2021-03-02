package com.wisport.scoring

import com.wisport.scoring.repository.MemberRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component

@Component
public class AppStartupRunner implements ApplicationRunner {
//
//    @Autowired
//    MemberRepository testRepository

    @Autowired
    ProcessResults processResults

    @Override
    public void run( ApplicationArguments args) throws Exception {
        processResults.parseResultsFile(  "FlambeauTT.csv", 202021 )
    }
}

