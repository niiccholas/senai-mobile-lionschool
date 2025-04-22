package br.senai.sp.jandira.lionschool.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.R

@Composable
fun InitialScreen(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            )
    {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp)
                .padding(top = 30.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            ){
                Image(
                    painter = painterResource(R.drawable.logo),
                    contentDescription = "",
                    modifier = Modifier.size(170.dp)
                )
                Text(
                    text = stringResource(R.string.app_name),
                    color = colorResource(R.color.blueschool),
                    fontSize = 40.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 15.dp).width(130.dp)
                )
            }
            Column(
                modifier = Modifier.padding(top = 100.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(7.dp),
            ) {
                Text(
                    text = stringResource(R.string.findyourcourse),
                    color = colorResource(R.color.blueschool),
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold
                )
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(5.dp))
                        .background(color = colorResource(R.color.yellowschool))
                        .height(6.dp)
                        .width(60.dp)
                )
                Text(
                    text = stringResource(R.string.paragraphInitial),
                    color = Color.Gray,
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(top = 25.dp)

                )
            }
            Button(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 30.dp)
                    .padding(top = 140.dp)
                    .height(50.dp),
                onClick = {},
                shape = RoundedCornerShape(17.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(R.color.yellowschool)
                ),
                border = BorderStroke(2.dp, colorResource(R.color.blueschool))
            ) {
                Text(
                    text = stringResource(R.string.getstarted),
                    color = colorResource(R.color.blueschool),
                    fontSize = 19.sp
                )
            }
            Row(
                modifier = Modifier.padding(top = 110.dp),
                horizontalArrangement = Arrangement.spacedBy(30.dp)
            ){
                Image(
                    painter = painterResource(R.drawable.youtube),
                    contentDescription = "Youtube",
                    modifier = Modifier.size(40.dp)
                )
                Image(
                    painter = painterResource(R.drawable.twitter),
                    contentDescription = "Twitter",
                    modifier = Modifier.size(40.dp)
                )
                Image(
                    painter = painterResource(R.drawable.instagram),
                    contentDescription = "Instagram",
                    modifier = Modifier.size(40.dp)
                )
                Image(
                    painter = painterResource(R.drawable.facebook),
                    contentDescription = "Facebook",
                    modifier = Modifier.size(40.dp)
                )

            }

        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun InitialScreenPreview () {
    InitialScreen()
}