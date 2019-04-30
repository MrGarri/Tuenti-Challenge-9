package challenges

import util.InputReaderImpl
import util.Utils
import kotlin.streams.toList

object Challenge1 {

    fun calculateTortillas(testFile: String): List<Int> =
        readTestFile(testFile).map { case ->
            var result = 0
            case.filter { it > 0 }.forEach {
                result += if (it.isEven()) (it / 2) else (it / 2) + 1
            }
            result
        }.toList()

    private fun readTestFile(testFile: String): List<List<Int>> {
        val reader = InputReaderImpl()

        return reader.parseTestInput(testFile).lines()
            .skip(1).map {
                it.split(" ").map(Integer::valueOf)
            }.toList()
    }

    private fun Int.isEven() = this.rem(2) == 0

}

fun main() {
    val tortillas = Challenge1.calculateTortillas("challenge1/submitInput.txt")
    Utils.writeResults(tortillas, "output/challenge1/submit_output.txt")
}