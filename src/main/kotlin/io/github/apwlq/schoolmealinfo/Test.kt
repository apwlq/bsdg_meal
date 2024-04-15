package io.github.apwlq.schoolmealinfo

import java.io.File

fun main()  {
    testStory()
}
fun testStory() {
    genStoryImage("오늘의 급식", getLunch(), getLunchKcal(), getDinner(), getDinnerKcal())
}