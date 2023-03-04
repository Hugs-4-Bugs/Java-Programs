import java.util.*;
 class reverseString {

    public static void main(String[] args) {
       StringBuilder sb = new StringBuilder(" Hello World");
         for(int i=0; i<sb.length()/2; i ++) {
           int front = i;
           int back = sb.length() - 1 - i; // 5-1-0 = > 4
          char frontChar = sb.charAt(front);
          char backChar = sb.charAt(back);
          sb.setCharAt(front, backChar);
          sb.setCharAt(back, frontChar);
       }
           System.out.println(sb);
     }
}


// Take input from user  👇👇👇👇👇👇


// import java.util.Scanner;

// public class reverseString {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter a string: ");
//     String str = sc.nextLine();
//     String reverse = "";
    
//     for (int i = str.length() - 1; i >= 0; i--) {
//       reverse = reverse + str.charAt(i);
//     }
    
//     System.out.println("The reversed string is: " + reverse);
//   }
// }
