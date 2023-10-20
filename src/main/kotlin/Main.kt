import java.io.File

fun main(args: Array<String>) {
    val dictionary = initDictionary()
    while (true) {
        println("Please type a letter (case sensitive) or exit to quit:")
        val letter = readLine()!!
        if (letter == "exit") {
            break
        } else if (letter.length > 1) {
            println("Please type only one letter")
            continue
        } else
            println("Please type a number (position):")
        val position = readLine()!!.toInt()

        val index = position - 1
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
                    "at position $position"
        )

        println("Do you want to see the words? (y/n)")
        val answer = readLine()!!
        if (answer == "y") {
            println()
            filteredDictionary.forEach { println(it) }
        }
        println("\n########\n")
    }
}

fun initDictionary(): List<String> {
    val url = ClassLoader.getSystemResource("german/german.dic")
    val file = File(url.toURI())
    return file.readLines(Charsets.ISO_8859_1)
        .map { it.trim() }
}
