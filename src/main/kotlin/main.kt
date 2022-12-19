package ru.netology

fun main() {
    val likes: Int = 1_101
    val lastDigit: Int = likes % 10                //последняя цифра
    val penultimateDigit: Int = likes / 10 % 10      //предпоследняя цифра

    if (lastDigit != 1) println("людям") else
        if (penultimateDigit != 1) println("человеку") else println("людям")
}