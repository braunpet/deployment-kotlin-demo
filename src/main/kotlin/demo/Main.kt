package demo

fun main() {
    println((1..15).joinToString(" ") { fizzBuzz(it) })
    println("\"A man, a plan, a canal: Panama\" is a palindrome: ${isPalindrome("A man, a plan, a canal: Panama")}")
    println("Words in \"continuous integration rocks\": ${wordCount("continuous integration rocks")}")
}
