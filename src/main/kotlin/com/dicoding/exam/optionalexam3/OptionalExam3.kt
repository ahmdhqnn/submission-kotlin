package com.dicoding.exam.optionalexam3

// TODO
fun manipulateString(str: String, int: Int): String {
    val numberInString = str.filter { it.isDigit() }

    if (numberInString.isNotEmpty()) {
        val extractedNumber = numberInString.toInt()
        val multipliedNumber = extractedNumber * int
        return str.replace(numberInString, multipliedNumber.toString())
    } else {
        return str + int
    }
}
