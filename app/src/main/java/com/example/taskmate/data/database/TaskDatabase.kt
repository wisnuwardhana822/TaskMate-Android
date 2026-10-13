package com.example.taskmate.data.database


import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

import com.example.taskmate.data.dao.TaskDao
import com.example.taskmate.data.model.Task


@Database(
    entities = [Task::class],
    version = 2,
    exportSchema = false
)
abstract class TaskDatabase : RoomDatabase() {


    abstract fun taskDao(): TaskDao


    companion object {


        @Volatile
        private var INSTANCE: TaskDatabase? = null


        fun getDatabase(
            context: Context
        ): TaskDatabase {


            return INSTANCE ?: synchronized(this) {


                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    TaskDatabase::class.java,
                    "task_database"
                )

                    // Karena struktur tabel berubah (tambah deadline)
                    // database lama akan dibuat ulang
                    .fallbackToDestructiveMigration()

                    .build()



                INSTANCE = instance


                instance
            }

        }

    }

}