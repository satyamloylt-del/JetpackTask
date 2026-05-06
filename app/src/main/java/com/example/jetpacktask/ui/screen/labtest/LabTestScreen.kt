package com.example.jetpacktask.ui.screen.labtest

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.rememberScrollableState
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.jetpacktask.R
import com.example.jetpacktask.ui.screen.labtest.component.booklabtestathome.BooklabTestAtHome
import com.example.jetpacktask.ui.screen.labtest.component.bookviadoctorprescriptionbox.BookViaDoctorPrescriptionBox
import com.example.jetpacktask.ui.screen.labtest.component.drcuratedhealtchekuppackage.DrCuratedHealthCheckup
import com.example.jetpacktask.ui.screen.labtest.component.drcuratedhealtchekuppackage.DrCuratedRepository
import com.example.jetpacktask.ui.screen.labtest.component.drcuratedhealtchekuppackage.DrCuratedViewModel
import com.example.jetpacktask.ui.screen.labtest.component.drcuratedhealtchekuppackage.DrCuratedViewModelFactory
import com.example.jetpacktask.ui.screen.labtest.component.mainservice.MainService
import com.example.jetpacktask.ui.screen.labtest.component.routinehealthcheckupformen.RoutineHealthChekup
import com.example.jetpacktask.ui.screen.labtest.component.searchbar.SearchBar
import com.example.jetpacktask.ui.screen.labtest.component.topappbar.Topbar
import com.example.jetpacktask.ui.screen.labtest.component.topbookedhealthcheckup.TopBookedPackage
import com.example.jetpacktask.ui.theme.MontserratFontFamily


@Preview(showBackground = true)
@Composable
fun LabTestScreen() {

    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {


        item(key = "topbar") {
            Topbar()
        }

        item(key = "banner") {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(260.dp)
                    .background(
                        brush = Brush.linearGradient(
                            colors = listOf(
                                colorResource(R.color.darkGreen),
                                colorResource(R.color.lightGreen)
                            )
                        ),
                        shape = RoundedCornerShape(bottomStart = 26.dp, bottomEnd = 26.dp)
                    )
            ) {
                Image(
                    painter = painterResource(R.drawable.researchimage),
                    contentDescription = null,
                    modifier = Modifier
                        .size(140.dp)
                        .align(Alignment.Center)
                )

                Image(
                    painter = painterResource(R.drawable.topbarimage),
                    contentDescription = null,
                    modifier = Modifier.fillMaxSize()
                )

                Column(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Spacer(modifier = Modifier.height(12.dp))
                    SearchBar()
                }
            }
        }

        // Main service
        item(key = "main_service") {
            MainService()
        }

        // Book doctor prescription
        item(key = "doctor_prescription") {
            BookViaDoctorPrescriptionBox()
        }

        // Dr curated health
        item(key = "dr_title") {
            Text(
                "Doctor-Curated Health Checkup Packages",
                color = Color.Black,
                fontSize = 14.sp,
                fontFamily = MontserratFontFamily,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(start = 12.dp)
            )
        }

        item(key = "dr_list") {
            Spacer(modifier = Modifier.height(12.dp))
            DrCuratedHealthCheckup()
        }

        // Top booked
        item(key = "top_title") {
            Spacer(modifier = Modifier.height(12.dp))
            Text(
                "Top Booked Health Checkup Packages",
                color = Color.Black,
                fontSize = 14.sp,
                fontFamily = MontserratFontFamily,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(start = 12.dp)
            )
        }

        item(key = "top_list") {
            Spacer(modifier = Modifier.height(12.dp))
            TopBookedPackage()
        }

        item(key = "book_home") {
            Spacer(modifier = Modifier.height(12.dp))
            BooklabTestAtHome()
        }

        item(key = "routine") {
            Text(
                "Routine Health Checkup for Men",
                color = Color.Black,
                fontSize = 14.sp,
                fontFamily = MontserratFontFamily,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(start = 12.dp)
            )
            Spacer(modifier = Modifier.height(12.dp))
            RoutineHealthChekup()
        }
    }
}
