/**
 * This class is used to test the PalindromeChecker class
 * @author Kirin Sharma
 * CS215 Assignment 2.2
 * @version 1.0
 *
 */

public class Application 
{

	public static void main(String[] args)
	{
		// Initializes a new PalindromeChecker object
		PalindromeChecker checker = new PalindromeChecker();
		
		// Tests a string with an expected outcome of true
		System.out.println("Testing if the string \"racecar\" is a palindrome. (Expected true)");
		System.out.println(checker.isPalindrome("racecar"));
		
		// Tests a string with punctuation with an expected outcome of true
		System.out.println("\nTesting if the string \"A man, a plan, a canal: Panama.\" is a palindrome. (Expected true)");
		System.out.println(checker.isPalindrome("A man, a plan, a canal: Panama."));
		
		// Tests a string with an expected outcome of false
		System.out.println("\nTesting if the string \"flowers\" is a palindrome. (Expected false)");
		System.out.println(checker.isPalindrome("flowers"));
		
	} // end main
	
} // end class
