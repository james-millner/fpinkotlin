package com.fpinkotlin.functions.exercise03


import io.kotlintest.properties.forAll
import io.kotlintest.specs.StringSpec

class FunctionsTest: StringSpec() {

    init {

        "add" {
            forAll { x: Int, y: Int ->
                add(x)(y) == x + y
            }
        }

        "moreAddition" {
            forAll { a: Int, b: Int, c: Int, d: Int  ->
                moreAddition(a)(b)(c)(d) == a + b + c + d
            }
        }
    }
}

