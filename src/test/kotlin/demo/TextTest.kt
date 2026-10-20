package demo

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class FizzBuzzTest {
    @Test
    fun plainNumberIsReturnedAsText() = assertEquals("1", fizzBuzz(1))

    @Test
    fun multipleOfThreeIsFizz() = assertEquals("Fizz", fizzBuzz(9))

    @Test
    fun multipleOfFiveIsBuzz() = assertEquals("Buzz", fizzBuzz(10))

    @Test
    fun multipleOfThreeAndFiveIsFizzBuzz() = assertEquals("FizzBuzz", fizzBuzz(15))

    @Test
    fun nonPositiveNumberIsRejected() {
        assertFailsWith<IllegalArgumentException> { fizzBuzz(0) }
    }
}

class PalindromeTest {
    @Test
    fun simpleWordIsRecognized() = assertTrue(isPalindrome("level"))

    @Test
    fun caseAndPunctuationAreIgnored() = assertTrue(isPalindrome("A man, a plan, a canal: Panama"))

    @Test
    fun otherWordsAreNotPalindromes() = assertFalse(isPalindrome("kotlin"))
}

class WordCountTest {
    @Test
    fun countsWordsSeparatedBySpaces() = assertEquals(3, wordCount("continuous integration rocks"))

    @Test
    fun multipleWhitespaceIsOneSeparator() = assertEquals(2, wordCount("  hello \n\t world  "))

    @Test
    fun emptyTextHasNoWords() = assertEquals(0, wordCount("   "))
}
