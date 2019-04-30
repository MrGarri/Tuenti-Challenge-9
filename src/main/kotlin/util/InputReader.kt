package util

import java.io.BufferedReader

interface InputReader {

    fun parseTestInput(fileName: String): BufferedReader

}