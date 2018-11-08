package lu.tim.spekdemo

import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe
import org.junit.Assert.assertEquals
import org.junit.Test

class SpekTest : Spek({

    describe("123") {
        context("wwww") {
            it("321") {
                assertEquals(1, 1)
            }
        }
    }
})


