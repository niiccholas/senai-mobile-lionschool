package br.senai.sp.jandira.lionschool.screens.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.R

@Composable
fun StudentCard() {
    Row(
        modifier = Modifier
            .clip(RoundedCornerShape(7.dp))
            .fillMaxWidth()
            .height(70.dp)
            .background(color = Color(0xff9FA9E1)),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .width(12.dp)
                .fillMaxHeight()
                .background(colorResource(R.color.yellowschool))
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            //dados
            Image(painter = painterResource(R.drawable.ellipse), contentDescription = "", modifier = Modifier.size(45.dp))
            Column(modifier = Modifier.padding(start = 10.dp)) {
                Text("Luana Oliveira", color = Color.White, fontSize = 20.sp, fontWeight = FontWeight.SemiBold, modifier = Modifier.padding(bottom = 4.dp))
                Row(
                    modifier = Modifier,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(imageVector = Icons.Default.AccountBox, contentDescription = "", modifier = Modifier.size(14.dp), tint = Color.White)
                    Text("20151018", fontSize = 11.sp, color = Color.White, fontWeight = FontWeight.Light, modifier = Modifier.padding(start = 4.dp))
                }
            }

            // spacer para empurrar a coluna para o final
            Spacer(modifier = Modifier.weight(1f))

            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .width(100.dp),
                verticalArrangement = Arrangement.Bottom, // Alinha o conteúdo ao fundo
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(modifier = Modifier.padding(bottom = 12.dp)) {
                    Icon(imageVector = Icons.Default.DateRange, contentDescription = "", tint = Color.White, modifier = Modifier.size(14.dp))
                    Text("2022", color = Color(0xFFFFC23D), fontSize = 12.sp, fontWeight = FontWeight.SemiBold, modifier = Modifier.padding(start = 2.dp))
                }
            }
        }
    }
}


@Preview
@Composable
private fun StudentCardPreview () {
    StudentCard()
}