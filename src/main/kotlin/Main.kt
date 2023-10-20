import java.io.File

fun main(args: Array<String>) {
    val dictionary = initDictionary()
    while (true) {
        println("Please type a letter (case sensitive) or exit to quit:")
        var letter = readLine()!!
        if (letter == "exit") {
            break
        } else if (letter.length > 1) {
            println("Please type only one letter")
            continue
        } else
            println("Please type a number (position):")
        var position = readLine()!!.toInt()

        var index = position - 1
        val filteredDictionary: List<String> =
            if (position == 0) {
                dictionary.filter { it.startsWith(letter, false) }
            } else {
                dictionary.filter {
                    return@filter if (it.length < position)
                        false
                    else
                        it[index].toString() == (letter)
                }
            }
        println(
            "There are ${filteredDictionary.size} words starting with $letter " +
                    "at position $position \n\n"
        )
        println("Do you want to see the words? (y/n)")
        val answer = readLine()!!
        if (answer == "y") {
            filteredDictionary.forEach { println(it) }
        }
    }
}

fun initDictionary(): List<String> {
    val url = ClassLoader.getSystemResource("german/german.dic")
    val file = File(url.toURI())
    return file.readLines(Charsets.ISO_8859_1)
        .map { it.trim() }
}
