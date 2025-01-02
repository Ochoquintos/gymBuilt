package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import com.example.myapplication.ui.theme.MyApplicationTheme
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.myapplication.Routines.generateArmsWorkout
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Popup
import androidx.compose.ui.window.PopupProperties
import com.example.myapplication.MuscleOptimization.armsMuscles

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MainScreen()

        }
    }
}

@Composable
fun MainScreen(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "home") {
        composable("home") { HomeScreen(navController) }
        composable("Upper Body"){ UpperBodyScreen(navController)}
        composable("Lower Body"){ LowerBodyScreen(navController)}
        composable("Arms"){ ArmsScreen(navController)}

        composable("ArmsRoutine/{arms}/{biceps}/{triceps}",
            arguments = listOf(
                navArgument("arms"){type= NavType.IntType;defaultValue=1},
                navArgument("biceps"){type=NavType.IntType;defaultValue=0},
                navArgument("triceps"){type=NavType.IntType;defaultValue=0}
            )
        )
        {
            backStackEntry ->
            val arms = backStackEntry.arguments?.getInt("arms")?:1
            val biceps = backStackEntry.arguments?.getInt("biceps")?:0
            val triceps = backStackEntry.arguments?.getInt("triceps")?:0
            ArmsRoutineScreen(navController, arms, biceps,triceps)
        }

        composable("Shoulders"){ ShouldersScreen(navController)}
        composable("Chest"){ ChestScreen(navController)}
        composable("Back"){ BackScreen(navController)}
    }
}

@Composable
fun HomeScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Red),
        contentAlignment = Alignment.TopCenter

    ) {

        Text(
            text = "Welcome to \n Builder",
            fontSize = 30.sp,
            style = TextStyle(textAlign = TextAlign.Center,
                fontFamily = FontFamily.SansSerif,
                lineHeight = 35.sp,
            ),
            modifier = Modifier
                .padding(20.dp)
                .offset(x = 0.dp, y = 100.dp)
                .background(Color.Yellow),
        )
    }
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Button(
            onClick = { navController.navigate("Upper Body") },
            modifier = Modifier
                .offset(x = 0.dp, y = 100.dp)
                .padding(16.dp)
                .background(Color.Green)
        ) {
            Text("Upper Body")
        }
    }
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Button(
            onClick = { navController.navigate("Lower Body") },
            modifier = Modifier
                .offset(x = 0.dp, y = (-30).dp)
                .padding(16.dp)
                .background(Color.Green)
        ) {
            Text("Lower Body")
        }
    }
}
@Composable
fun UpperBodyScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.TopStart
    ) {
        Button(
            onClick = { navController.navigate("home") },
            modifier = Modifier.padding(16.dp)
        ) {
            Text("Return")
        }
    }
    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text = "What you wanna hit today",textAlign = TextAlign.Center,
            modifier = Modifier.offset(x=0.dp,y=50.dp))
        Button(onClick={navController.navigate("Arms")},
            modifier = Modifier
                .padding(16.dp)
                .offset(x = 0.dp, y = 90.dp)){
            Text("Arms",
                modifier = Modifier.background(Color.Yellow),
                fontSize = 16.sp,
                color = Color.Red)
        }
        Button(onClick={navController.navigate("Shoulders")},
            modifier = Modifier
                .padding(16.dp)
                .offset(x = 0.dp, y = 90.dp)){
            Text("Shoulders",
                modifier = Modifier.background(Color.Yellow),
                fontSize = 16.sp,
                color = Color.Red)
        }
        Button(onClick={navController.navigate("Chest")},
            modifier = Modifier
                .padding(16.dp)
                .offset(x = 0.dp, y = 90.dp)){
            Text("Chest",
                modifier = Modifier.background(Color.Yellow),
                fontSize = 16.sp,
                color = Color.Red)
        }
        Button(onClick={navController.navigate("Back")},
            modifier = Modifier
                .padding(16.dp)
                .offset(x = 0.dp, y = 90.dp)){
            Text("Back",
                modifier = Modifier.background(Color.Yellow),
                fontSize = 16.sp,
                color = Color.Red)
        }
    }


}


@Composable
fun LowerBodyScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text("This is the Details Screen")
    }
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Button(
            onClick = { navController.navigate("home") },
            modifier = Modifier.padding(16.dp)
        ) {
            Text("Go to Home")
        }
    }
}


@Composable
fun DetailsScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text("This is the Details Screen")
    }
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Button(
            onClick = { navController.navigate("home") },
            modifier = Modifier.padding(16.dp)
        ) {
            Text("Go to Home")
        }
    }
}


@Composable
fun ArmsScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Red),
        contentAlignment = Alignment.TopStart
    ) {
        Button(
            onClick = { navController.navigate("Upper Body") },
            modifier = Modifier.padding(16.dp)
        ) {
            Text("Return")
        }
    }
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.TopCenter
    ) {
        Text(text = "What do you wanna emphasize?", fontSize = 14.sp,
            modifier = Modifier
                .offset(x = 0.dp, y = 80.dp)
                .background(Color.White))
    }
    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Button(onClick={navController.navigate("ArmsRoutine/1/0/0")},
            modifier = Modifier
                .padding(16.dp)
                .offset(x = 0.dp, y = 90.dp)){
            Text("Arms",
                modifier = Modifier.background(Color.Yellow),
                fontSize = 16.sp,
                color = Color.Red)
        }
        Button(onClick={navController.navigate("ArmsRoutine/0/1/0")},
            modifier = Modifier
                .padding(16.dp)
                .offset(x = 0.dp, y = 90.dp)){
            Text("Biceps",
                modifier = Modifier.background(Color.Yellow),
                fontSize = 16.sp,
                color = Color.Red)
        }
        Button(onClick={navController.navigate("ArmsRoutine/0/0/1")},
            modifier = Modifier
                .padding(16.dp)
                .offset(x = 0.dp, y = 90.dp)){
            Text("Triceps",
                modifier = Modifier.background(Color.Yellow),
                fontSize = 16.sp,
                color = Color.Red)
        }
    }
}



@Composable
fun PopupDemo(onDismiss: () -> Unit,offsetX:Int=0,offsetY:Int=0, muscleOpt:String="") {
    Popup(
        alignment = Alignment.Center,
        onDismissRequest = { onDismiss() }
    ) {
        Box(
            modifier = Modifier
                .offset(x = (offsetX).dp, y = (offsetY).dp)
                .size(300.dp, 200.dp)
                .background(Color.Cyan)
                .border(1.dp, color = Color.Black),
            contentAlignment = Alignment.TopCenter
        ) {
            Text(text="Activation\n ${armsMuscles[muscleOpt]}",
                    textAlign = TextAlign.Center,
                    fontSize = 13.sp,
                    lineHeight = 20.sp,
                    style = TextStyle(textAlign = TextAlign.Center,
                        fontFamily = FontFamily.SansSerif,
                    ),
                modifier = Modifier.align(Alignment.TopCenter)
            )
            Button(
                onClick = { onDismiss() },
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(16.dp),
                colors = ButtonDefaults.buttonColors(Color.Transparent)
            ) {
                //Text("Close")
            }
        }
    }
}


//@Composable
//fun ArmsRoutineScreen(navController: NavController, arms:Int=1,biceps:Int=0,triceps:Int=0) {
//
//    val showPopupMap = remember { mutableStateMapOf<String, Boolean>() }
//    Box(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(Color.Red),
//        contentAlignment = Alignment.TopStart
//    ) {
//        Button(
//            onClick = { navController.navigate("Arms") },
//            modifier = Modifier.padding(16.dp)
//        ) {
//            Text("Return")
//        }
//    }
//
//
//    val workout = generateArmsWorkout(arms,biceps,triceps)
//    Column(//horizontalAlignment = Alignment.CenterHorizontally,
//        modifier = Modifier
//            .offset(x = 0.dp, y = 150.dp)
//            .background(Color.Blue)
//    )
//    {
//        for(i in 0..<workout.size){
//            val entry = workout.entries.toList()[i]
//            Row(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(1.dp)
//                    .height(800.dp),
//            ){
//                var c:Color
//                if(i==0){c=Color.Cyan}
//                if(i==1){c=Color.Green}
//                if(i==2){c=Color.White}
//                else{c=Color.Yellow}
//                Box(
//
//                    modifier = Modifier
//                        .offset(y = (-750 * i).dp)
//                        .background(color = c)
//                ){
//                    Text(text="muscle:${entry.key}\n Exercise: ${entry.value}",
//                        textAlign = TextAlign.Start,
//                        fontSize = 13.sp,
//                        lineHeight = 20.sp,
//                        style = TextStyle(textAlign = TextAlign.Center,
//                            fontFamily = FontFamily.SansSerif,
//                        ),
//                        modifier = Modifier
//                            .offset(x = (80).dp, y = (0).dp)
//                            .background(c)
//                            .padding(10.dp)
//                            .width(220.dp),
//
//                        )
//                    Button(
//                        onClick = { showPopupMap[entry.key] = true },
//                        modifier = Modifier//.alpha(0f)
//                            .offset(x = (-110).dp, y = (0).dp)
//                            .width(150.dp)
//                            .background(Color.LightGray)
//
//                    ) {
//                    }
//                }
//
//
//                // Display the PopupDemo Composable if showPopup is true
//                if (showPopupMap[entry.key] == true) {
//                    PopupDemo(
//                        onDismiss = { showPopupMap[entry.key] = false },
//                        offsetX = 0, offsetY = 0
//                    )
//                }
//            }
//
//        }
//    }
//}



////Code works, but buttons are not displayed correctly
//
//@Composable
//fun ArmsRoutineScreen(navController: NavController, arms:Int=1,biceps:Int=0,triceps:Int=0) {
//
//    val showPopupMap = remember { mutableStateMapOf<String, Boolean>() }
//    Box(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(Color.Red),
//        contentAlignment = Alignment.TopStart
//    ) {
//        Button(
//            onClick = { navController.navigate("Arms") },
//            modifier = Modifier.padding(16.dp)
//        ) {
//            Text("Return")
//        }
//    }
//
//
//    val workout = generateArmsWorkout(arms,biceps,triceps)
//    Column(//horizontalAlignment = Alignment.CenterHorizontally,
//        modifier = Modifier
//            .offset(x = 0.dp, y = 150.dp)
//            .background(Color.Blue)
//    )
//    {
//        for(i in 0..<workout.size){
//            val entry = workout.entries.toList()[i]
//            Row(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(1.dp)
//                    .height(55.dp),
//            ){
//                Text(text="muscle:${entry.key}\n Exercise: ${entry.value}",
//                    textAlign = TextAlign.Start,
//                    fontSize = 13.sp,
//                    lineHeight = 20.sp,
//                    style = TextStyle(textAlign = TextAlign.Center,
//                        fontFamily = FontFamily.SansSerif,
//                    ),
//                    modifier = Modifier
//                        .offset(x = (80).dp, y = (0).dp)
//                        .background(Color.Cyan)
//                        .padding(10.dp)
//                        .width(220.dp),
//
//                    )
//                Button(
//                    onClick = { showPopupMap[entry.key] = true },
//                    modifier = Modifier//.alpha(0f)
//                        .offset(x = (-110).dp, y = (0).dp)
//                        .width(150.dp)
//                        .background(Color.LightGray)
//
//                ) {
//                }
//
//
//                // Display the PopupDemo Composable if showPopup is true
//                if (showPopupMap[entry.key] == true) {
//                    PopupDemo(
//                        onDismiss = { showPopupMap[entry.key] = false },
//                        offsetX = 0, offsetY = 0
//                    )
//                }
//            }
//
//        }
//    }
//}




@Composable
fun ArmsRoutineScreen(navController: NavController, arms:Int=1,biceps:Int=0,triceps:Int=0) {

    val showPopupMap = remember { mutableStateMapOf<String, Boolean>() }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Red),
        contentAlignment = Alignment.TopStart
    ) {
        Button(
            onClick = { navController.navigate("Arms") },
            modifier = Modifier.padding(16.dp),
        ) {
            Text("Return")
        }
    }


    val workout = generateArmsWorkout(arms,biceps,triceps)
    Box(modifier = Modifier
        .fillMaxSize() // Makes the Box span the entire screen
        .background(Color.Transparent)
    )
    {
        Column(//horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .offset(x = 0.dp, y = 150.dp)
                .background(Color.Blue)
                .height(700.dp)
        )
        {
            for (i in 0..<workout.size) {
                val entry = workout.entries.toList()[i]
                var c0 = Color.Yellow
                var c1 = Color.Cyan
                var c2 = Color.Transparent
                if (i == 10) {
                    c0 = Color.Transparent;c1 = Color.Transparent;c2 = Color.Transparent
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()

                        .padding(1.dp)
                        .height(55.dp)
                        //.offset(x = (0).dp, y = (-645*i).dp)
                        .background(c0),
                ) {

                    Text(
                        text = "muscle:${entry.key}\n Exercise: ${entry.value}",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        lineHeight = 20.sp,
                        style = TextStyle(
                            textAlign = TextAlign.Center,
                            fontFamily = FontFamily.SansSerif,
                        ),
                        modifier = Modifier
                            .offset(x = (80).dp, y = (0).dp)
                            .background(c1)
                            .padding(10.dp)
                            .width(220.dp),

                        )
                    Button(
                        onClick = { showPopupMap[entry.key] = true },
                        modifier = Modifier//.alpha(0f)
                            //.size(0.dp)
                            .offset(x = (-110).dp, y = (0).dp)
                            .width(150.dp)
                            .background(c2),
                        enabled = true,
                        colors = ButtonDefaults.buttonColors(Color.Transparent)

                    ) {
                    }


//                    // Display the PopupDemo Composable if showPopup is true
//                    if (showPopupMap[entry.key] == true) {
//                        PopupDemo(
//                            onDismiss = { showPopupMap[entry.key] = false },
//                            offsetX = (0), offsetY = 55 * (-i) + 200
//                        )
//                    }
                }

            }
        }; for(i in 0..<workout.size) {
            val entry = workout.entries.toList()[i]
            if (showPopupMap[entry.key] == true) {
                Box(
                    modifier = Modifier
                        .offset(y=240.dp)
                        .fillMaxSize()
                        .background(Color.Transparent) // Optional: dim the background
                        .clickable { showPopupMap[entry.key] = false }, // Dismiss on outside touch
                    contentAlignment = Alignment.BottomCenter // Align popup to the bottom
                ) {
                    PopupDemo(onDismiss = { showPopupMap[entry.key] = false },
                        offsetX = 0, offsetY =0,
                        entry.key)
                }
            }
        }

    }
}


@Composable
fun ShouldersScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text("This is the Details Screen")
    }
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Button(
            onClick = { navController.navigate("home") },
            modifier = Modifier.padding(16.dp)
        ) {
            Text("Go to Home")
        }
    }
}


@Composable
fun ChestScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text("This is the Details Screen")
    }
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Button(
            onClick = { navController.navigate("home") },
            modifier = Modifier.padding(16.dp)
        ) {
            Text("Go to Home")
        }
    }
}


@Composable
fun BackScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text("This is the Details Screen")
    }
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Button(
            onClick = { navController.navigate("home") },
            modifier = Modifier.padding(16.dp)
        ) {
            Text("Go to Home")
        }
    }
}