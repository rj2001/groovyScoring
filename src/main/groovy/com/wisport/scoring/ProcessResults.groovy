package com.wisport.scoring

class ProcessResults {
    public void processResults() {
        new File("src/main/resources/Results/2018/FlambeauTT.csv").eachLine { line ->
            if(!line.contains("Bib")){ println line } // TODO - first line = keys for columns, map to appropriate data structure
        }
    }
}
