package Palindrome;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class PalindromeTest {

    @DisplayName("The method should check is given word is a palindrome")
    @Test
    void test01() {
        //given
        String givenWord="tot";
        //when
        boolean resultOfTheMethod= Palindrome.isPalindrome(givenWord);
        //then
        Assertions.assertThat(resultOfTheMethod).isTrue();
    }

    @DisplayName("The method should check is given word is a palindrome, even if it's not only in lowercase ")
    @Test
    void test02() {
        //given
        String givenWord="Tot";
        //when
        boolean resultOfTheMethod= Palindrome.isPalindrome(givenWord);
        //then
        Assertions.assertThat(resultOfTheMethod).isTrue();
    }

    @DisplayName("The method should check is given word is a palindrome, for few examples ")
    @Test
    void test03() {
        //given
        String givenWordFirst="toT";
        String givenWordSecound="OOOOOOOO";
        String givenWordThird="JUG";
        //when
        boolean resultOfTheMethodForFirstWord= Palindrome.isPalindrome(givenWordFirst);
        boolean resultOfTheMethodForSecoundWord= Palindrome.isPalindrome(givenWordSecound);
        boolean resultOfTheMethodForThirddWord= Palindrome.isPalindrome(givenWordThird);
        //then
        Assertions.assertThat(resultOfTheMethodForFirstWord).isTrue();
        Assertions.assertThat(resultOfTheMethodForSecoundWord).isTrue();
        Assertions.assertThat(resultOfTheMethodForThirddWord).isFalse();
    }

    }
