fun main(args: Array<String>) {

    val answer1 = "Egypt"
    val answer2 = "Mississippi"
    val answer3 = "Australia"
    val answer4 = "island"
    val answer5 = "Panama"

    print("The Nile River is located in _________?")
    var userAnswer = readln()
    if (userAnswer.equals(answer1, ignoreCase = true)) {
        println("Correct!")
    } else {
        println("Incorrect. The Nile River is located in $answer1")
    }

    print("The ____________ River has served to divide the US over the years?")
    userAnswer = readln()
    if (userAnswer.equals(answer2, ignoreCase = true)) {
        println("Correct!")
    } else {
        println("Incorrect. The $answer2 River has served to divide the US.")
    }

    print("___________ is referred to as Down Under.")
    userAnswer = readln()
    if (userAnswer.equals(answer3, ignoreCase = true)) {
        println("Correct!")
    } else {
        println("Incorrect. $answer3 is referred to as Down Under.")
    }

    print("England is located on an ________.")
    userAnswer = readln()
    if (userAnswer.equals(answer4, ignoreCase = true)) {
        println("Correct!")
    } else {
        println("Incorrect. England is located on an $answer4.")
    }

    print("The Panama Canal is located in __________.")
    userAnswer = readln()
    if (userAnswer.equals(answer5, ignoreCase = true)) {
        println("Correct!")
    } else {
        println("Incorrect. The Panama Canal is located in $answer5.")
    }
}