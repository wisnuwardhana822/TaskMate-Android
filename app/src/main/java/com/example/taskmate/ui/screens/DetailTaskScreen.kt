package com.example.taskmate.ui.screens


import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

import com.example.taskmate.viewmodel.TaskViewModel


@Composable
fun DetailTaskScreen(
    taskId: Int,
    navController: NavController,
    viewModel: TaskViewModel
){

    val tasks by viewModel.tasks.collectAsState()


    val task = tasks.find {
        it.id == taskId
    }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp)
    ){

        if(task == null){

            Text(
                text = "Task tidak ditemukan"
            )


        }else{


            Text(
                text = "Task Detail",
                style = MaterialTheme.typography.headlineMedium
            )


            Spacer(
                modifier = Modifier.height(24.dp)
            )


            Card(
                modifier = Modifier.fillMaxWidth(),

                shape = RoundedCornerShape(24.dp)

            ){

                Column(
                    modifier = Modifier.padding(20.dp)
                ){


                    Text(
                        text = task.title,
                        style = MaterialTheme.typography.titleLarge
                    )


                    Spacer(
                        modifier = Modifier.height(12.dp)
                    )


                    Text(
                        text = task.description
                    )


                    Spacer(
                        modifier = Modifier.height(20.dp)
                    )


                    Text(
                        text =
                            "Priority : ${task.priority}"
                    )


                    Spacer(
                        modifier = Modifier.height(12.dp)
                    )


                    Text(
                        text =
                            if(task.isDone)
                                "Status : Completed"
                            else
                                "Status : In Progress"
                    )

                }

            }



            Spacer(
                modifier = Modifier.height(30.dp)
            )


            // BUTTON EDIT

            Button(

                modifier = Modifier.fillMaxWidth(),

                shape = RoundedCornerShape(18.dp),

                onClick = {


                    navController.navigate(
                        "edit_task/${task.id}"
                    )


                }

            ){

                Text(
                    text = "Edit Task"
                )

            }



            Spacer(
                modifier = Modifier.height(12.dp)
            )



            // BUTTON DELETE

            Button(

                modifier = Modifier.fillMaxWidth(),

                shape = RoundedCornerShape(18.dp),


                colors = ButtonDefaults.buttonColors(

                    containerColor =
                        MaterialTheme.colorScheme.error

                ),


                onClick = {


                    viewModel.deleteTask(task)


                    navController.navigateUp()


                }

            ){

                Text(
                    text = "Delete Task"
                )

            }


        }


    }


}