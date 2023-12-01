package dev.kata.langtonant

class Surface {
    private var area: Area = Area.White

    fun colorIn(position: String): Area {
        return this.area
    }

    fun changeTo(position: String, area: Area) {
        this.area = area
    }
}
