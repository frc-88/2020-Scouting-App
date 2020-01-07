package com.example.scout882020.database.entities;


import androidx.room.Entity;

@Entity(primaryKeys = {"teamNumber","matchNumber"})
public class TeamMatchStatistics {
    public int teamNumber;
    public int matchNumber;

    //Autonomous Data
    public boolean initiationLine;
    public int autoInnerMisses;
    public int autoInnerMakes;
    public int autoOuterMisses;
    public int autoOuterMakes;
    public int autoLowerMisses;
    public int autoLowerMakes;

}
