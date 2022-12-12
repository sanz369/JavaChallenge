//Java Challenge (3/20)
//
//A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
//Given a string s, return true if it is a palindrome, or false otherwise.

//Example 1:
//Input: s = "A man, a plan, a canal: Panama"
//Output: true
//Explanation: "amanaplanacanalpanama" is a palindrome.

//Example 2:
//Input: s = "race a car"
//Output: false
//Explanation: "raceacar" is not a palindrome.

//Example 3:
//Input: s = " "
//Output: true
//Explanation: s is an empty string "" after removing non-alphanumeric characters.
//Since an empty string reads the same forward and backward, it is a palindrome.


package week1.day2;

public class JavaChallenge3PhrasePalindrome {

	public static void main(String[] args) {
	
		String text="A man, a plan, a canal: Panama";
		String lowerCase = text.toLowerCase();
		String onlyText = lowerCase.replaceAll("[^A-Za-z]", "");
		String reverse="";
		System.out.println(onlyText);
		char[] charArray = onlyText.toCharArray();
		for (int i = charArray.length-1; i >=0; i--) {
			reverse+=charArray[i];
		}
		System.out.println(reverse);
		if(onlyText.equals(reverse))
			System.out.println("Palindrome");
		else
			System.out.println("Not a palindrome");
		
	}

	}


