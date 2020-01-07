package com.example.scout882020.database.entities;


import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Team {
    @PrimaryKey
    public int teamNumber;

    public String name;
}
