fun main() {
    calculateInput()
}

fun calculateInput() {

    var repeatProgram = true

    while (repeatProgram) {

        try {
            print("შეიყვანეთ X-ის მნიშვნელობა: ")
            val x = readln().toInt()
            print("შეიყვანეთ Y-ის მნიშვნელობა: ")
            val y = readln().toInt()

            val z = x + y
            println("$x-ის და $y-ის ჯამი არის: $z")

        } catch (e: NumberFormatException) {
            println("შეიყვანეთ მხოლოდ ციფრი!!!")
            continue
        }
        var validInput = false
        while (!validInput) {

            println("გსურთ პროგრამის თავიდან დაწყება <Y/N>?")
            val question = readln()

            when (question) {
                "Y", "y" -> {
                    validInput = true
                }
                "N", "n" -> {
                    repeatProgram = false
                    break
                }
                else -> {
                    println("შეიყვანეთ ან \'Y' ან \'N'!!")
                }
            }
        }
    }
}

