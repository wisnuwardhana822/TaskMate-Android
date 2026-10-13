package com.example.taskmate.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

import com.example.taskmate.data.model.Task
import com.example.taskmate.viewmodel.TaskViewModel


@Composable
fun AddTaskScreen(
    viewModel: TaskViewModel,
    navController: NavController
) {


    var title by remember {
        mutableStateOf("")
    }


    var description by remember {
        mutableStateOf("")
    }


    var priority by remember {
        mutableStateOf("Medium")
    }


    var deadline by remember {
        mutableStateOf("")
    }




    Column(

        modifier =
            Modifier
                .fillMaxSize()
                .padding(24.dp)

    ){



        Text(

            text = "Create Task ✨",

            style =
                MaterialTheme.typography.headlineMedium

        )



        Spacer(
            modifier =
                Modifier.height(6.dp)
        )



        Text(

            text =
                "Plan your work and stay productive",

            style =
                MaterialTheme.typography.bodyMedium

        )



        Spacer(
            modifier =
                Modifier.height(24.dp)
        )




        Card(

            modifier =
                Modifier.fillMaxWidth(),


            shape =
                RoundedCornerShape(24.dp),


            elevation =
                CardDefaults.cardElevation(

                    defaultElevation = 6.dp

                )

        ){



            Column(

                modifier =
                    Modifier.padding(20.dp)

            ){





                OutlinedTextField(

                    modifier =
                        Modifier.fillMaxWidth(),


                    value = title,


                    onValueChange = {

                        title = it

                    },


                    label = {

                        Text("Task Title")

                    },


                    placeholder = {

                        Text(
                            "Example: Finish Android Project"
                        )

                    },


                    shape =
                        RoundedCornerShape(16.dp)

                )





                Spacer(
                    Modifier.height(16.dp)
                )





                OutlinedTextField(

                    modifier =
                        Modifier
                            .fillMaxWidth()
                            .height(120.dp),


                    value = description,


                    onValueChange = {

                        description = it

                    },


                    label = {

                        Text("Description")

                    },


                    placeholder = {

                        Text(
                            "Write task details..."
                        )

                    },


                    shape =
                        RoundedCornerShape(16.dp)

                )





                Spacer(
                    Modifier.height(16.dp)
                )





                OutlinedTextField(

                    modifier =
                        Modifier.fillMaxWidth(),


                    value = deadline,


                    onValueChange = {

                        deadline = it

                    },


                    label = {

                        Text("📅 Deadline")

                    },


                    placeholder = {

                        Text(
                            "Example: 20 Oktober 2026"
                        )

                    },


                    shape =
                        RoundedCornerShape(16.dp)

                )





                Spacer(
                    Modifier.height(22.dp)
                )





                Text(

                    text =
                        "Priority",

                    style =
                        MaterialTheme.typography.titleMedium

                )





                Spacer(
                    Modifier.height(10.dp)
                )





                Row(

                    horizontalArrangement =
                        Arrangement.spacedBy(8.dp)

                ){



                    listOf(

                        "Low",
                        "Medium",
                        "High"

                    ).forEach { item ->



                        FilterChip(

                            selected =
                                priority == item,


                            onClick = {

                                priority = item

                            },


                            label = {

                                Text(

                                    when(item){

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





                Spacer(
                    Modifier.height(30.dp)
                )





                Button(

                    modifier =
                        Modifier
                            .fillMaxWidth()
                            .height(55.dp),


                    shape =
                        RoundedCornerShape(18.dp),



                    onClick = {



                        if(title.isNotBlank()){


                            viewModel.insertTask(


                                Task(


                                    title = title,


                                    description =
                                        description,


                                    isDone = false,


                                    priority =
                                        priority,


                                    deadline =
                                        deadline


                                )


                            )



                            title = ""

                            description = ""

                            priority =
                                "Medium"

                            deadline = ""



                            navController.navigateUp()


                        }


                    }


                ){



                    Text(

                        text =
                            "Save Task"

                    )



                }




            }



        }



    }



}