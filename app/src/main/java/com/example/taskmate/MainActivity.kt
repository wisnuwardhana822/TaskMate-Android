package com.example.taskmate

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.taskmate.data.database.TaskDatabase
import com.example.taskmate.data.repository.TaskRepository
import com.example.taskmate.navigation.NavGraph
import com.example.taskmate.ui.theme.TaskMateTheme
import com.example.taskmate.viewmodel.TaskViewModel


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)


        setContent {

            TaskMateTheme {


                val database = TaskDatabase.getDatabase(
                    applicationContext
                )


                val repository = TaskRepository(
                    database.taskDao()
                )


                val viewModel = TaskViewModel(
                    repository
                )


                NavGraph(
                    viewModel = viewModel
                )


            }

        }

    }

}