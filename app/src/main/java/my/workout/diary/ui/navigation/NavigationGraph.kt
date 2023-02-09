package my.workout.diary.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import my.workout.diary.ui.DietScreen
import my.workout.diary.ui.ProfileScreen
import my.workout.diary.ui.WorkoutCalendarScreen


@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomNavItem.WorkoutCalenderMenu.screenRoute
    ) {
        composable(BottomNavItem.WorkoutCalenderMenu.screenRoute) {
            WorkoutCalendarScreen()
        }
        composable(BottomNavItem.DietMenu.screenRoute) {
            DietScreen()
        }
        composable(BottomNavItem.ProfileMenu.screenRoute) {
            ProfileScreen()
        }
    }
}