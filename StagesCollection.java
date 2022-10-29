package com.example.project;

import java.util.ArrayList;

public class StagesCollection implements BasicCollection<Stage>{

    private ArrayList<Stage> stages;

    public StagesCollection(){
        stages = new ArrayList<>();
    }



    public void add(Stage stage){
        stages.add(stage);
    }

    public Stage[] getAll(){
        Stage[] arr = new Stage[stages.size()];

        for (int i = 0; i < stages.size(); i++){
            arr[i] = stages.get(i);
        }

        return arr;
    }

    @Override
    public int size() {
        return stages.size();
    }

    @Override
    public boolean isEmpty() {
        return stages.isEmpty();
    }

    @Override
    public Stage get(int i) {
        return stages.get(i);
    }
}
