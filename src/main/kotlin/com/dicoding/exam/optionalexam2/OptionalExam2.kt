package com.dicoding.exam.optionalexam2

// TODO
fun minAndMax(number: Int): Int {
    val digits = number.toString()

    val minDigit = digits.minOrNull() ?: '0'
    val maxDigit = digits.maxOrNull() ?: '0'

    return (minDigit - '0') + (maxDigit - '0')
}
