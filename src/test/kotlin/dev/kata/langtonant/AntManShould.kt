package dev.kata.langtonant

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class AntManShould {
    @Test
    fun `should be in the center when it appears from the white surface`() {
        val surface = Surface()

        val antman = LangtonAnt(surface)

        assertEquals(Area.White, surface.colorIn("0 0"))
        assertEquals("0 0 N", antman.location)
    }

    @Test
    fun `move always forward and turns to right when the area is white`() {
        val surface = Surface()
        val antman = LangtonAnt(surface)

        antman.move()

        assertEquals(Area.White, surface.colorIn("0 1"))
        assertEquals("0 1 E", antman.location)
    }

    @Test
    fun `move always forward and turns to left when the area is black`() {
//        val matrix = [
//            [Area.White, Area.Black, Area.White],
//            [Area.White, Area.White, Area.White],
//            [Area.White, Area.White, Area.White]
//        ]
        val surface = Surface()
        val antman = LangtonAnt(surface)

        antman.move()

        assertEquals(Area.Black, surface.colorIn("0 1"))
        assertEquals("0 1 W", antman.location)
    }
}
