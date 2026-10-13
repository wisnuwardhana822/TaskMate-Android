package com.example.taskmate.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

import com.example.taskmate.data.model.Task
import com.example.taskmate.navigation.Screen
import com.example.taskmate.viewmodel.TaskViewModel


@Composable
fun DashboardScreen(
    navController: NavController,
    viewModel: TaskViewModel
) {


    val tasks by viewModel.tasks.collectAsState()


    var searchText by remember {
        mutableStateOf("")
    }


    var selectedPriority by remember {
        mutableStateOf("All")
    }



    val filteredTasks = tasks.filter { task ->


        val matchSearch =
            task.title.contains(
                searchText,
                ignoreCase = true
            )
                    ||
                    task.description.contains(
                        searchText,
                        ignoreCase = true
                    )



        val matchPriority =
            selectedPriority == "All"
                    ||
                    task.priority == selectedPriority



        matchSearch && matchPriority

    }





    val completed =
        tasks.count {
            it.isDone
        }



    val progress =
        if(tasks.isEmpty())
            0f
        else
            completed.toFloat() /
                    tasks.size.toFloat()





    Column(

        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)

    ){



        Text(

            text = "Good Morning 👋",

            style =
                MaterialTheme.typography.titleMedium

        )



        Spacer(
            modifier =
                Modifier.height(4.dp)
        )



        Text(

            text = "TaskMate",

            style =
                MaterialTheme.typography.headlineLarge

        )



        Text(

            text =
                "Stay focused and finish your goals",

            style =
                MaterialTheme.typography.bodySmall

        )



        Spacer(
            modifier =
                Modifier.height(20.dp)
        )





        OutlinedTextField(

            modifier =
                Modifier.fillMaxWidth(),


            value = searchText,


            onValueChange = {

                searchText = it

            },


            label = {

                Text("Search Task")

            },


            placeholder = {

                Text(
                    "Find your task..."
                )

            },


            shape =
                RoundedCornerShape(16.dp)

        )





        Spacer(
            modifier =
                Modifier.height(16.dp)
        )




        Text(

            text =
                "Filter Priority",

            style =
                MaterialTheme.typography.titleMedium

        )



        Spacer(
            modifier =
                Modifier.height(8.dp)
        )




        Row(

            horizontalArrangement =
                Arrangement.spacedBy(8.dp)

        ){



            listOf(

                "All",
                "High",
                "Medium",
                "Low"

            ).forEach { priority ->




                FilterChip(

                    selected =
                        selectedPriority == priority,


                    onClick = {

                        selectedPriority = priority

                    },


                    label = {

                        Text(priority)

                    }

                )



            }


        }





        Spacer(
            modifier =
                Modifier.height(20.dp)
        )





        Card(

            modifier =
                Modifier.fillMaxWidth(),


            shape =
                RoundedCornerShape(24.dp),


            colors =
                CardDefaults.cardColors(

                    containerColor =
                        Color(0xFFE8EAF6)

                )

        ){



            Column(

                modifier =
                    Modifier.padding(20.dp)

            ){



                Text(

                    text =
                        "Today's Progress",

                    style =
                        MaterialTheme.typography.titleMedium

                )



                Spacer(
                    Modifier.height(12.dp)
                )



                LinearProgressIndicator(

                    progress = progress,


                    modifier =
                        Modifier.fillMaxWidth()

                )



                Spacer(
                    Modifier.height(10.dp)
                )



                Text(

                    text =
                        "$completed of ${tasks.size} tasks completed"

                )



            }



        }

        Spacer(
            modifier =
                Modifier.height(25.dp)
        )



        Text(

            text =
                "Upcoming Tasks",

            style =
                MaterialTheme.typography.titleLarge

        )



        Spacer(
            modifier =
                Modifier.height(12.dp)
        )




        if(filteredTasks.isEmpty()) {



            Card(

                modifier =
                    Modifier.fillMaxWidth(),

                shape =
                    RoundedCornerShape(20.dp)

            ) {



                Column(

                    modifier =
                        Modifier.padding(20.dp)

                ) {



                    Text(

                        text =
                            "🎯 No Tasks Yet",

                        style =
                            MaterialTheme.typography.titleMedium

                    )



                    Text(

                        text =
                            "Create your first task and stay productive"

                    )


                }



            }



        } else {



            LazyColumn(

                modifier =
                    Modifier.weight(1f),


                verticalArrangement =
                    Arrangement.spacedBy(14.dp)

            ) {



                items(filteredTasks) { task ->



                    TaskCard(

                        task = task,


                        onClick = {

                            navController.navigate(

                                Screen.DetailTask
                                    .createRoute(task.id)

                            )

                        },



                        onDelete = {

                            viewModel.deleteTask(task)

                        },



                        onCheck = {



                            viewModel.updateTask(

                                task.copy(

                                    isDone =
                                        !task.isDone

                                )

                            )



                        }


                    )



                }



            }



        }





        Spacer(

            modifier =
                Modifier.height(12.dp)

        )




        Button(

            modifier =
                Modifier
                    .fillMaxWidth()
                    .height(55.dp),


            shape =
                RoundedCornerShape(20.dp),



            onClick = {



                navController.navigate(

                    Screen.AddTask.route

                )



            }



        ) {



            Text(

                text =
                    "+ Add New Task"

            )


        }



    }



}







@Composable
fun TaskCard(

    task: Task,

    onClick: () -> Unit,

    onDelete: () -> Unit,

    onCheck: () -> Unit

) {



    Card(



        modifier =
            Modifier
                .fillMaxWidth()
                .clickable {

                    onClick()

                },



        shape =
            RoundedCornerShape(24.dp),



        elevation =
            CardDefaults.cardElevation(

                defaultElevation = 6.dp

            )



    ) {



        Column(

            modifier =
                Modifier.padding(18.dp)

        ) {



            Row(

                modifier =
                    Modifier.fillMaxWidth(),


                horizontalArrangement =
                    Arrangement.SpaceBetween


            ) {



                Row(

                    modifier =
                        Modifier.weight(1f)

                ) {



                    Checkbox(

                        checked =
                            task.isDone,


                        onCheckedChange = {

                            onCheck()

                        }

                    )



                    Column {



                        Text(

                            text =
                                task.title,


                            style =
                                MaterialTheme.typography.titleMedium,



                            color =
                                if(task.isDone)

                                    Color.Gray

                                else

                                    Color.Black

                        )



                        Spacer(

                            modifier =
                                Modifier.height(5.dp)

                        )



                        Text(

                            text =
                                task.description,


                            style =
                                MaterialTheme.typography.bodySmall

                        )




                    }



                }





                TextButton(

                    onClick =
                        onDelete

                ) {



                    Text(

                        text =
                            "Delete",

                        color =
                            Color.Red

                    )



                }



            }





            Spacer(

                modifier =
                    Modifier.height(12.dp)

            )





            Row(

                horizontalArrangement =
                    Arrangement.spacedBy(8.dp)

            ) {



                AssistChip(


                    onClick = {},


                    label = {



                        Text(

                            text =
                                "📅 ${task.deadline}"

                        )



                    }



                )





                AssistChip(


                    onClick = {},


                    label = {



                        Text(

                            text =
                                when(task.priority){


                                    "High" ->
                                        "🔴 High"


                                    "Low" ->
                                        "🟢 Low"


                                    else ->
                                        "🟡 Medium"


                                }

                        )



                    }



                )



            }



        }



    }



}