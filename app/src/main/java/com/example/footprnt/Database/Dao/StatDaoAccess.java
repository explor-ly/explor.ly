/*
 * StatDaoAccess.java
 * v1.0
 * July 2019
 * Copyright ©2019 Footprnt Inc.
 */
package com.example.footprnt.Database.Dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.example.footprnt.Database.Models.StatWrapper;

/**
 * This is an interface which acts is an intermediary between the user and the database.
 * All the operation to be performed on the posts table is defined here.
 *
 * @author Clarisa Leu-Rodriguez
 */
@Dao
public interface StatDaoAccess {
    @Insert
    void insertStat(StatWrapper stat);

    @Query("SELECT * FROM stats")
    StatWrapper fetchAllStats();

    @Query("SELECT * FROM stats WHERE username=:username")
    StatWrapper getStat(String username);
}
