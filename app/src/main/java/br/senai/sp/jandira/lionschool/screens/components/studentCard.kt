package br.senai.sp.jandira.lionschool.screens.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.senai.sp.jandira.lionschool.R

@Composable
fun StudentCard(){
    Row(
        modifier = Modifier.clip(RoundedCornerShape(7.dp)).fillMaxWidth().height(70.dp).background(color = Color(0xff9FA9E1))
        , verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier.width(12.dp).fillMaxHeight().background(colorResource(R.color.yellowschool))
        )
        Image(painter = painterResource(R.drawable.ellipse), contentDescription = "", modifier = Modifier.size(50.dp).padding(start = 10.dp))
    }
}

@Preview
@Composable
private fun StudentCardPreview () {
    StudentCard()
}