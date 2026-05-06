package com.example.jetpacktask.ui.screen.labtest.component.routinehealthcheckupformen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.jetpacktask.model.RoutineHealthChekup

@Composable
fun RoutineHealthChekup() {
    val viewmodel: RoutineHealthCheckupViewModel =
        viewModel(factory = RoutineHealthCheckupFactory(RoutineHealthChecupForManRepository()))
    val data = viewmodel._routineCheckupLiveData.observeAsState(emptyList())

    LaunchedEffect(Unit) {
        viewmodel.getTopPackage()
    }

    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 12.dp, end = 12.dp)
            .wrapContentHeight()
    ) {
        items(data.value) { item ->
            RoutineCard(item)
        }
    }
}

@Composable
fun RoutineCard(routineHealthChekup: RoutineHealthChekup) {

    Column(modifier = Modifier.size(100.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        Box(
            modifier = Modifier
                .size(50.dp)
                .background(color = Color(routineHealthChekup.color), shape = CircleShape),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(routineHealthChekup.image),
                contentDescription = null,
                modifier = Modifier.size(40.dp)
            )
        }
        Spacer(modifier = Modifier.height(6.dp))
        Text(routineHealthChekup.age, color = Color.Black, fontSize = 12.sp)
    }

}