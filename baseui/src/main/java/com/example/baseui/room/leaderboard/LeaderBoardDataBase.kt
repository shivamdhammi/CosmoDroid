package com.example.baseui.room.leaderboard

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.baseui.room.BaseDB
import com.example.baseui.room.DBRegistry

@Database(entities = [DataEntity::class], version = 1)
abstract class LeaderBoardDataBase : BaseDB, RoomDatabase() {
    abstract fun leaderBoardDao(): LeaderBoardDao

    companion object {
        private const val DATABASE_NAME = "leaderBoard.db"

        @Volatile
        private var instance: LeaderBoardDataBase? = null
        operator fun invoke(context: Context) = instance ?: synchronized(this) {
            instance ?: buildDatabase(context).also {
                DBRegistry.registerDB(it)
                instance = it
            }
        }

        private fun buildDatabase(context: Context) = Room.databaseBuilder(
            context,
            LeaderBoardDataBase::class.java, DATABASE_NAME
        ).fallbackToDestructiveMigration()
            .build()
    }

    override fun clear() {
        TODO("Not yet implemented")
    }
}