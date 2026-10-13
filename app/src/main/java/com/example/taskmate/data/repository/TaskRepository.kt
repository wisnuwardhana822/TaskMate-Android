package com.example.taskmate.data.repository

import com.example.taskmate.data.dao.TaskDao
import com.example.taskmate.data.model.Task
import kotlinx.coroutines.flow.Flow


class TaskRepository(
    private val taskDao: TaskDao
) {


    val allTasks: Flow<List<Task>> =
        taskDao.getAllTasks()



    suspend fun insert(task: Task) {

        taskDao.insertTask(task)

    }



    suspend fun update(task: Task) {

        taskDao.updateTask(task)

    }



    suspend fun delete(task: Task) {

        taskDao.deleteTask(task)

    }

}