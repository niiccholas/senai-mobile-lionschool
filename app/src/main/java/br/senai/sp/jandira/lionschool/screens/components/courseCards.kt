package br.senai.sp.jandira.lionschool.screens.components

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.R
import br.senai.sp.jandira.lionschool.screens.components.StudentCard

@Composable
fun CourseCards(
    background1: Color = Color.Transparent, background2: Color = Color.Transparent,
    img: Painter, text1: String = "", text2: String = "", text3: String = ""

){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
            .clip(RoundedCornerShape(16.dp))
            .background(
                brush = Brush.linearGradient(
                    listOf(background1, background2)
                )
            )
            .clickable(onClick = {})
            .padding(vertical = 8.dp)
            .padding(start = 45.dp)
            .padding(end = 0.dp)
    )
    {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ){
            Image(
                painter = img,
                contentDescription = "",
                Modifier.size(110.dp)
            )
            Text(
                text = text1,
                fontSize = 60.sp,
                fontWeight = FontWeight.SemiBold,
                color = colorResource(R.color.yellowschool),
                modifier = Modifier.padding(start = 20.dp)
            )
        }
        Text(
            text = text2,
            fontWeight = FontWeight.SemiBold,
            color = Color.White,
            fontSize = 20.sp
        )
        Text(
            text = text3,
            color = Color.White,
            fontSize = 13.sp,
            modifier = Modifier.padding(top = 5.dp)
        )
        Row (
            modifier = Modifier.padding(top = 10.dp)
        ){
            Image(
                painter = painterResource(R.drawable.watch),
                contentDescription = ""
            )
            Text(
                text = stringResource(R.string.semesters),
                fontSize = 10.sp,
                color = Color.White,
                fontWeight = FontWeight.Light,
                modifier = Modifier.padding(horizontal = 4.dp)
            )
        }
    }
}

