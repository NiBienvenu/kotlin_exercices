import java.io.File

fun main() {
    File("file.txt").forEachLine {
        println(it)
    }
    File("excel.xlsx").forEachLine {

    }
}