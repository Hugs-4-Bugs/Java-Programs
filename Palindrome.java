// // Take input from user

// import java.util.Scanner;
 
// class Palindrome {
//     public static void main(String[] args) {
//         Scanner scanner=new Scanner(System.in);
//         System.out.println("Enter a string");
//         String input= scanner.nextLine();
//         //checking whether palindrome or not
//         if(isPalindrome(input))
//         {
//             System.out.println(input+" is a palindrome string");
//         }
//         else
//         {
//             System.out.println(input+" is not a palindrome string");
//         }
//     }
 
//     public static boolean isPalindrome(String str) {
//         int left = 0, right = str.length() - 1;
        
//         while(left < right)
//         {
//             if(str.charAt(left) != str.charAt(right))
//             {
//                 return false;
//             }
//             left++;
//             right--;
//         }
//         return true;
//     } 
// }

// without taking input from users 

import java.io.*;

class Palindrome {
	public static boolean isPalindrome(String str){
		String rev = "";
		boolean ans = false;

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		if (str.equals(rev)) {
			ans = true;
		}
		return ans;
	}
	public static void main(String[] args)
	{
		// Input string
		String str = "abcba";

		// Convert the string to lowercase
		str = str.toLowerCase();
		boolean A = isPalindrome(str);
		System.out.println(A);
	}
}