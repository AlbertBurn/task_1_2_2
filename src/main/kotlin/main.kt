fun main() {
    val likes = 58

    val people =
        if ((likes % 10 === 2) || (likes % 10 === 3)) "людям" else if (likes % 10 === 1) "человеку" else "человекам"

    println("Нравится $likes $people")

}