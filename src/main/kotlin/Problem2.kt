/*
Even Fibonacci numbers

https://projecteuler.net/problem=1

Each new term in the Fibonacci sequence is generated by adding the previous two terms.
By starting with 1 and 2, the first 10 terms will be:

1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

By considering the terms in the Fibonacci sequence whose values do not exceed four million,
find the sum of the even-valued terms.

Resolved by JGuzmanDev
Date: 29/03/2021
*/

fun main(args: Array<String>) {
    //printFibonacci()
//    println(fibonacci(10))
}

private fun printFibonacci() {
    var num1 = 0
    var num2 = 1
    var counter = 0
    var sum = 0

    while (true) {
        counter = num1 + num2
        num1 = num2
        num2 = counter
        if (counter >= 4000000) {
            break;
        } else {
            if (counter % 2 == 0) sum += counter
        }
    }
    println("the even-valued terms $sum")
}

private fun fibonacci(num:Int):Int {
    if(num == 1) return 1
    if (num == 2) return 2
    return fibonacci(num-1) + fibonacci(num-2)
}