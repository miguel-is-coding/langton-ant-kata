package dev.kata.langtonant

class LangtonAnt(private val surface: Surface) {
    var location: String = "0 0 N"

    fun move() {
        surface.changeTo("0 1", Area.White)
        location = "0 1 E"
    }

}
