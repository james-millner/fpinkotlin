package com.fpinkotlin.functions.exercise04


class Functions

fun square(n: Int) = n * n

fun triple(n: Int) = n * 3

val add: (Int) -> (Int) -> Int = { a -> { b -> a + b} }

val compose: ((Int) -> Int) -> ((Int) -> Int) -> ((Int) -> Int) = { x -> { y -> { x(y(it)) } } }
