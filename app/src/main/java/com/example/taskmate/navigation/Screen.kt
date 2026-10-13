package com.example.taskmate.navigation


sealed class Screen(
    val route: String
) {


    object Dashboard :
        Screen("dashboard")


    object AddTask :
        Screen("add_task")


    object DetailTask :
        Screen("detail_task/{taskId}") {

        fun createRoute(taskId: Int): String {
            return "detail_task/$taskId"
        }

    }

}