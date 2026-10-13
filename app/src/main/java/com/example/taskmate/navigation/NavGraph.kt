package com.example.taskmate.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

import com.example.taskmate.ui.screens.AddTaskScreen
import com.example.taskmate.ui.screens.DashboardScreen
import com.example.taskmate.ui.screens.DetailTaskScreen
import com.example.taskmate.ui.screens.EditTaskScreen
import com.example.taskmate.viewmodel.TaskViewModel


@Composable
fun NavGraph(
    viewModel: TaskViewModel
) {

    val navController = rememberNavController()


    NavHost(
        navController = navController,
        startDestination = Screen.Dashboard.route
    ) {


        // =========================
        // DASHBOARD
        // =========================

        composable(
            route = Screen.Dashboard.route
        ) {

            DashboardScreen(
                viewModel = viewModel,
                navController = navController
            )

        }



        // =========================
        // ADD TASK
        // =========================

        composable(
            route = Screen.AddTask.route
        ) {

            AddTaskScreen(
                viewModel = viewModel,
                navController = navController
            )

        }



        // =========================
        // DETAIL TASK
        // =========================

        composable(
            route = "detail_task/{taskId}",
            arguments = listOf(
                navArgument("taskId"){
                    type = NavType.IntType
                }
            )
        ){ entry ->


            val taskId =
                entry.arguments?.getInt("taskId")
                    ?: 0


            DetailTaskScreen(
                taskId = taskId,
                navController = navController,
                viewModel = viewModel
            )


        }



        // =========================
        // EDIT TASK
        // =========================

        composable(
            route = "edit_task/{taskId}",
            arguments = listOf(
                navArgument("taskId"){
                    type = NavType.IntType
                }
            )
        ){ entry ->


            val taskId =
                entry.arguments?.getInt("taskId")
                    ?: 0


            EditTaskScreen(
                taskId = taskId,
                navController = navController,
                viewModel = viewModel
            )

        }

    }

}