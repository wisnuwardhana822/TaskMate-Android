package com.example.taskmate.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope

import com.example.taskmate.data.model.Task
import com.example.taskmate.data.repository.TaskRepository

import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch


class TaskViewModel(
    private val repository: TaskRepository
) : ViewModel() {


    val tasks =
        repository.allTasks.stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5000),
            initialValue = emptyList()
        )


    fun insertTask(task: Task){

        viewModelScope.launch {

            repository.insert(task)

        }

    }



    fun updateTask(task: Task){

        viewModelScope.launch {

            repository.update(task)

        }

    }



    fun deleteTask(task: Task){

        viewModelScope.launch {

            repository.delete(task)

        }

    }


}