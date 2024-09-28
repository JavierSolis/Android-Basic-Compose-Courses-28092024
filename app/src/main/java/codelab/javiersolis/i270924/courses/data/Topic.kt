package codelab.javiersolis.i270924.courses.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

/**
 * Created by Javier J. Solis Flores on 28/09/24.
 * @email solis.unmsm@gmail.com
 * @github https://github.com/JavierSolis
 */
data class Topic(
    @StringRes val name: Int,
    val courses: Int,
    @DrawableRes val image: Int
)