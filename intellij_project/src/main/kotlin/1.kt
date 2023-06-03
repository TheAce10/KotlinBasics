fun main() {
    print(true)
    println()

//    calc(123)


//fun calc(int: Int) {
//    val new = "\$$int"
//    println(new)
//}

//fun calc1(int: Int) {
//
//}

    val languageName: String = "kotlin"

    var upperCase: String = languageName.toUpperCase()

    print(upperCase)
    upperCase = "null"
    var num = 1223
    println(num.inc())

    if (num > 2){
        print("True")
    } else if(num == 2) {
        print("Equal")
    }
    else {
        println("False")
    }

    /*Conditional statements are useful for representing stateful logic,
     but you may find that you repeat yourself when writing them. In the example above,
      you simply print a String in each branch. To avoid this repetition, Kotlin offers conditional expressions.
       The last example can be rewritten as follows:*/
    val count = 40
    var answerString: String = if (count == 42) {
        "I have the answer."
    } else if (count > 35) {
        "The answer is close."
    } else {
        "The answer eludes me."
    }

    /*As the complexity of your conditional statement grows, you might consider replacing your if-else expression with a when expression,
     as shown in the following example:*/

    answerString = when {
        count == 42 -> "I have the answer."
        count > 35 -> "The answer is close."
        else -> "The answer eludes me."
    }
    println(answerString)

    /*Kotlin’s conditionals highlight one of its more powerful features, smart casting. Rather than using the safe-call operator or the not-null assertion operator to work with nullable values, you can instead check if a variable contains a reference to a null value using a conditional statement, as shown in the following example:*/

    val languageName1: String? = null
    if (languageName1 != null) {
        // No need to write languageName?.toUpperCase()
        println(languageName.toUpperCase())
    }

    val stringLengthFunc: (String) -> Int = { input ->
        input.length
    }

    val stringLength: Int = stringLengthFunc("Android")

    val edward: (String) -> Int = {input -> input.length}

}

fun generateAnswerString(count: Int): String {
    val answerString = if (count == 42) {
        "I have the answer."
    } else {
        "The answer eludes me"
    }
    return answerString

    /*fun generateAnswerString(countThreshold: Int): String {
        return if (count > countThreshold) {
            "I have the answer."
        } else {
            "The answer eludes me."
        }
    }*/

    /*fun generateAnswerString(countThreshold: Int): String = if (count > countThreshold) {
        "I have the answer"
    } else {
        "The answer eludes me"
    }*/

    /*Like named functions, anonymous functions can contain any number of expressions. The returned value of the function is the result of the final expression.

In the example above, stringLengthFunc contains a reference to an anonymous function that takes a String as input and returns the length of the input String as output of type Int. For that reason, the function's type is denoted as (String) -> Int. This code does not invoke the function, however. To retrieve the result of the function, you must invoke it with like you would a named function. You must supply a String when calling stringLengthFunc, as shown in the following example:*/
    val stringLengthFunc: (String) -> Int = { input ->
        input.length
    }

    val stringLength: Int = stringLengthFunc("Android")

    val edward: (String) -> Int = {input -> input.length}
    
}