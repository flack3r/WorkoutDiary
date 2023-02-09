package my.workout.diary.ui.navigation

import my.workout.diary.R
import my.workout.diary.ui.CALENDAR
import my.workout.diary.ui.DIET
import my.workout.diary.ui.PROFILE

sealed class BottomNavItem(
    val title: Int, val icon: Int, val screenRoute: String
) {
    object WorkoutCalenderMenu: BottomNavItem(R.string.workout_menu, R.drawable.calendar_menu, CALENDAR)
    object DietMenu: BottomNavItem(R.string.diet_menu, R.drawable.diet_menu, DIET)
    object ProfileMenu: BottomNavItem(R.string.profile_menu, R.drawable.profile_menu, PROFILE)
}