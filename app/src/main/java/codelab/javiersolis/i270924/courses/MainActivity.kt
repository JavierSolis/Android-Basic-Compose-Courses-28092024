package codelab.javiersolis.i270924.courses

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import codelab.javiersolis.i270924.courses.data.DataSource
import codelab.javiersolis.i270924.courses.data.Topic
import codelab.javiersolis.i270924.courses.ui.theme.CodeLabCoursesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CodeLabCoursesTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CoursesApp(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun CoursesApp(modifier: Modifier = Modifier) {
    LazyVerticalStaggeredGrid(
        columns = StaggeredGridCells.Fixed(2),
        verticalItemSpacing = 8.dp,
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier.fillMaxSize(),
        content =  {
            items(DataSource.topics) { topic ->
                CourseItem(topic = topic)
            }
        }
    )
}

@Composable
fun CourseItem(topic: Topic, modifier: Modifier = Modifier) {
    Row(modifier = modifier
        .height(68.dp)
        .fillMaxWidth()
        .clip(RoundedCornerShape(size = 16.dp))
        .background(colorResource(id = R.color.background_item))
    ) {
        //add image whit crop expand

        Image(
            painter = painterResource(id = topic.image),
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .height(68.dp)
                .width(68.dp)
                .clip(RoundedCornerShape(topStart = 16.dp, bottomStart = 16.dp)),
            contentDescription = null
        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp, start = 16.dp, end = 16.dp)
        ){
            Text(
                style = MaterialTheme.typography.bodyMedium,
                text = stringResource(id = topic.name),
                color = Color.Black
            )
            Row (modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp)){
                Image(
                    modifier = Modifier.padding(end = 8.dp),
                    painter = painterResource(id = R.drawable.ic_grain),
                    contentDescription = null,
                    colorFilter = ColorFilter.tint(Color.Black)
                )
                Text(
                    style = MaterialTheme.typography.labelMedium,
                    text = "${topic.courses}",
                    color = Color.Black
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CourseItemPreview() {
    CodeLabCoursesTheme {
        CourseItem(
            topic = Topic(R.string.architecture, 58, R.drawable.architecture),
            modifier = Modifier)
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CodeLabCoursesTheme {
        CoursesApp()
    }
}