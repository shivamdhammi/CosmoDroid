package com.example.baseui.room.leaderboard

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface LeaderBoardDao {
    @Query("SELECT * FROM dataEntity")
    fun getData(): List<DataEntity>

    @Insert
    fun insertAll(vararg todo: DataEntity)
}