package com.example.taskmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskmanager.ui.theme.TaskManagerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskManagerTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                )
                {
                    CompletedTask()
                }
            }
        }
    }
}

@Composable
//CompletedTask function
fun CompletedTask() {
    Column(
        //center align content vertically/horizontally on screen
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        //image from download
        val image = painterResource(R.drawable.ic_task_completed)
        Image(painter = image, contentDescription = null)
        //text1: bold, top padding 24dp, bottom padding 9dp (All tasks completed)
        Text(
            text = stringResource(R.string.all_tasks_completed),
            modifier = Modifier.padding(top = 24.dp, bottom = 9.dp),
            fontWeight = FontWeight.Bold
        )
        //text2: font size 15sp (Nice work!)
        Text(
            text = stringResource(R.string.nice_work),
            fontSize = 15.sp
        )
    }
}


@Preview(showBackground = true)
@Composable
fun CompletedTaskPreview() {
    TaskManagerTheme {
        CompletedTask()
    }
}