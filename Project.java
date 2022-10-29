package com.example.project;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Project {
    private String projectID;
//    private String customerID;
    private int stageNum;
    private int duration;
    private StagesCollection stagesCollection = new StagesCollection();

    public Project(String projectID,int stageNum) {
        this.projectID = projectID;
        this.stageNum = stageNum;
    }

    public String getProjectID(){
        return projectID;
    }

    public int getDuration(){
        int count = 0;
        if (stagesCollection.isEmpty())
            duration = count;

        Date firstStage = stagesCollection.get(0).getDate();
        Date lastStage = stagesCollection.get(stagesCollection.size() - 1).getDate();

        long diff = lastStage.getTime() - firstStage.getTime();

        int diffDays = (int)TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);;
        duration = diffDays;
        return duration;
    }
    public int getStageNum(){
        return stageNum;
    }

    public StagesCollection getStagesCollection() {
        return stagesCollection;
    }
}
