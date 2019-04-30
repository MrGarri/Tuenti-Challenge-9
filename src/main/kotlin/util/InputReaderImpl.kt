package util

import java.io.BufferedReader

class InputReaderImpl : InputReader{

    override fun parseTestInput(fileName: String): BufferedReader =
        this.javaClass.classLoader
            .getResourceAsStream(fileName)
            .bufferedReader()

}
