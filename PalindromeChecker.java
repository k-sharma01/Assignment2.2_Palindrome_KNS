import java.util.Stack;

/**
 * This class is used to check whether a specific string is a palindrome
 * @author Kirin Sharma
 * CS215 Assignment 2.2
 * @version 1.0
 *
 */

public class PalindromeChecker 
{

	private Stack<Character> characterStack; //holds stack of characters representing reverse of input string
	
	
	/**
	 * Default constructor initializes the characterStack
	 */
	public PalindromeChecker()
	{
		characterStack = new Stack<Character>();
	} // end default constructor
	
	
	/**
	 * This method takes an input string and determines whether it is a palindrome,
	 * ignoring all whitespaces and other punctuation
	 * @param input the string to test whether it is a palindrome or not
	 * @return true if the input string is a palindrome, false if not
	 */
	public boolean isPalindrome(String input)
	{
		input = formatString(input);
		
		// Load string into characterStack, essentially reversing the string
		for(int i = 0; i < input.length(); i++)
			characterStack.push(input.charAt(i));
		
		for(int i = 0; i < input.length(); i++)
		{
			if(input.charAt(i) != characterStack.pop())
				return false;
		}
		
		return true;
		
	} // end isPalindrome
	
	
	/**
	 * Private method to format an input string so that it has no whitespaces or other punctuation
	 * @param input the string which to format
	 * @return the formatted string
	 */
	private String formatString(String input)
	{
		input = input.strip().toLowerCase();
		String formattedString = "";
		
		// Determine if each individual character is a letter, if so add to formattedString
		for(int i = 0; i < input.length(); i++)
		{
			if(Character.isLetter(input.charAt(i)))
				formattedString += input.charAt(i);
		} // end for
		
		return formattedString;
		
	} // end formatString
	
	
} // end class
