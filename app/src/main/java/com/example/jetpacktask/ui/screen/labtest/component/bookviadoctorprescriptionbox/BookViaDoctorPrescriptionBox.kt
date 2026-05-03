package com.example.jetpacktask.ui.screen.labtest.component.bookviadoctorprescriptionbox

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.scaleMatrix
import com.example.jetpacktask.R
import com.example.jetpacktask.ui.theme.MontserratFontFamily


@Preview(showBackground = true)
@Composable
fun BookViaDoctorPrescriptionBox() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(150.dp)
            .padding(start = 12.dp, end = 12.dp)
            .background(
                color = colorResource(R.color.mediumgreen), shape = RoundedCornerShape(16.dp)
            )
    ) {


        Row(modifier = Modifier.fillMaxSize()) {
            Column(
                modifier = Modifier
                    .weight(2f)
                    .padding(start = 20.dp)
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Book Via Doctor Prescription",
                    color = Color.White,
                    fontFamily = MontserratFontFamily,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(6.dp))
                Text(
                    text = "Our experts will book the test for you as\nper your prescription.",
                    color = Color.White,
                    fontFamily = MontserratFontFamily,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Normal,
                    lineHeight = 14.sp
                )
                Spacer(modifier = Modifier.height(12.dp))
                Button(
                    onClick = {

                    },
                    modifier = Modifier
                        .width(140.dp)
                        .height(35.dp),
                    shape = RoundedCornerShape(8.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.White
                    )
                ) {
                    Text(
                        text = "Upload Now",
                        color = Color.Black,
                        fontFamily = MontserratFontFamily,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Normal,
                        lineHeight = 14.sp
                    )
                }

            }

            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight(),
                contentAlignment = Alignment.CenterStart
            ) {
                Image(
                    painter = painterResource(id = R.drawable.boyimage),
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .wrapContentSize()

                )
            }
        }




        Image(
            painterResource(R.drawable.threedot),
            contentDescription = null,
            modifier = Modifier
                .wrapContentWidth()
                .height(12.dp)
                .padding(bottom = 6.dp)
                .align(Alignment.BottomCenter)
        )

        Image(
            painterResource(R.drawable.shapeimage),
            contentDescription = null,
            modifier = Modifier
                .width(130.dp)
                .height(85  .dp)
                .align(Alignment.BottomEnd),
            alignment = Alignment.BottomEnd
        )
    }
}