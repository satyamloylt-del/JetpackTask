package com.example.jetpacktask.ui.screen.labtest.component.mainservice

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpacktask.R
import com.example.jetpacktask.ui.theme.MontserratFontFamily


@Preview(showBackground = true)
@Composable
fun MainService() {

    Row(modifier = Modifier.fillMaxWidth().padding(start = 12.dp, end = 12.dp)) {
        ShowComponent(modifier = Modifier.weight(1f).height(220.dp),R.drawable.frame1,"Blood Tests","CBC, Health Packages")
        Spacer(modifier = Modifier.width(8.dp))
        ShowComponent(modifier = Modifier.weight(1f).height(220.dp),R.drawable.frame3,"X-Rays & Scans","Ultrasound, MRI & More")
        Spacer(modifier = Modifier.width(8.dp))
        ShowComponent(modifier = Modifier.weight(1f).height(220.dp),R.drawable.frame2,"Book Via WhatsApp","Appointments & More")
    }

}

@Composable
fun ShowComponent(modifier: Modifier,image:Int,title:String,subtitle:String) {
    Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .height(120.dp),
            painter = painterResource(image),
            contentDescription = null
        )
        Spacer(modifier = Modifier.height(2.dp))

        Text(
            title, style = TextStyle(
                fontSize = 10.sp,
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                fontFamily = MontserratFontFamily,
            ),
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            subtitle, style = TextStyle(
                fontSize = 10.sp,
                color = Color.Gray,
                fontWeight = FontWeight.Normal,
                fontFamily = MontserratFontFamily,
            ),
            textAlign = TextAlign.Center
        )


    }
}