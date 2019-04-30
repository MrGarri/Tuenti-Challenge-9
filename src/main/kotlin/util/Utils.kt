package util

import java.io.File
import java.io.FileWriter

object Utils {

    private const val RESULT_FORMAT = "Case %d: %s\n"

    fun <T> printResults(iterable: Iterable<T>) =
        iterable.forEachIndexed { index, it -> print(String.format(RESULT_FORMAT, index+1, it)) }

    fun <T> writeResults(iterable: Iterable<T>, fileName: String) {

        val file = File(fileName)
        if (file.exists()) file.delete()
        file.createNewFile()

        val fileWriter = FileWriter(fileName, true)

        iterable.map { it.toString() }.forEachIndexed { index, it ->
            fileWriter.write(String.format(RESULT_FORMAT, index+1, it))
        }

        fileWriter.flush()
        fileWriter.close()

    }
}