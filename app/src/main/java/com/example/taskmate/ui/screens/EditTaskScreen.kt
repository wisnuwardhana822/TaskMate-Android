package com.example.taskmate.ui.screens


import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

import com.example.taskmate.navigation.Screen
import com.example.taskmate.viewmodel.TaskViewModel


@Composable
fun EditTaskScreen(

    taskId: Int,

    navController: NavController,

    viewModel: TaskViewModel

){

    val tasks by viewModel.tasks.collectAsState()


    val task = tasks.find {

        it.id == taskId

    }


    if(task == null){

        Text(
            text = "Task tidak ditemukan"
        )

        return

    }


    var title by remember {

        mutableStateOf(task.title)

    }


    var description by remember {

        mutableStateOf(task.description)

    }



    Column(

        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp)

    ){


        Text(

            text = "Edit Task",

            style = MaterialTheme.typography.headlineMedium

        )


        Spacer(

            modifier = Modifier.height(24.dp)

        )



        OutlinedTextField(

            modifier = Modifier.fillMaxWidth(),

            value = title,

            onValueChange = {

                title = it

            },

            label = {

                Text("Title")

            }

        )



        Spacer(

            modifier = Modifier.height(16.dp)

        )



        OutlinedTextField(

            modifier = Modifier.fillMaxWidth(),

            value = description,

            onValueChange = {

                description = it

            },

            label = {

                Text("Description")

            }

        )



        Spacer(

            modifier = Modifier.height(24.dp)

        )



        Button(

            modifier = Modifier.fillMaxWidth(),


            onClick = {


                viewModel.updateTask(

                    task.copy(

                        title = title,

                        description = description

                    )

                )



                // kembali ke Dashboard setelah save

                navController.navigate(Screen.Dashboard.route){

                    popUpTo(Screen.Dashboard.route){

                        inclusive = true

                    }

                }


            }

        ){

            Text(

                text = "Save Changes"

            )

        }


    }

}