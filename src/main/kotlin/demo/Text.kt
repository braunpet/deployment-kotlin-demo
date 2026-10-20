package demo

// Classic FizzBuzz: multiples of 3 -> "Fizz", of 5 -> "Buzz", of both -> "FizzBuzz".
fun fizzBuzz(n: Int): String {
    require(n > 0) { "n must be positive" }
    return when {
        n % 15 == 0 -> "FizzBuzz"
        n % 3 == 0 -> "Fizz"
        n % 5 == 0 -> "Buzz"
        else -> n.toString()
    }
}

// A palindrome reads the same forwards and backwards; case, spaces and punctuation are ignored.
fun isPalindrome(text: String): Boolean {
    val letters = text.lowercase().filter { it.isLetterOrDigit() }
    return letters == letters.reversed()
}

// Counts the words of a text; words are separated by any amount of whitespace.
fun wordCount(text: String): Int =
    text.trim().split(Regex("\\s+")).count { it.isNotEmpty() }
