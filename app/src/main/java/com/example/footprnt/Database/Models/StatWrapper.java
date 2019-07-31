/*
 * StatWrapper.java
 * v1.0
 * July 2019
 * Copyright ©2019 Footprnt Inc.
 */
package com.example.footprnt.Database.Models;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import com.parse.ParseUser;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

@Entity(tableName = "stats")
public class StatWrapper implements Serializable {

    @PrimaryKey
    @NonNull
    public String username;
    @ColumnInfo(name = "cityVisited")
    public int cityVisited;
    @ColumnInfo(name = "countryVisited")
    public int countryVisited;
    @ColumnInfo(name = "continentVisited")
    public int continentVisited;

    public StatWrapper(){}

    public StatWrapper(ArrayList<HashMap<String, Integer>> statList, ParseUser user) {
        username = user.getUsername();
        cityVisited = statList.get(0).size();
        countryVisited = statList.get(1).size();
        continentVisited = statList.get(2).size();
    }

    @NonNull
    public String getUsername() {
        return username;
    }

    public void setUsername(@NonNull String username) {
        this.username = username;
    }

    public int getCityVisited() {
        return cityVisited;
    }

    public void setCityVisited(int cityVisited) {
        this.cityVisited = cityVisited;
    }

    public int getCountryVisited() {
        return countryVisited;
    }

    public void setCountryVisited(int countryVisited) {
        this.countryVisited = countryVisited;
    }

    public int getContinentVisited() {
        return continentVisited;
    }

    public void setContinentVisited(int continentVisited) {
        this.continentVisited = continentVisited;
    }
}
