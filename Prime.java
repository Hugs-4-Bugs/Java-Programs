// java code to check whether the number is prime or not 

// Take input from user

import java.util.*;
public class Prime {
    public static void main(String args[]){
        int  temp, num;
        boolean isPrime = true;
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        in.close();
        for(int i = 2; i<=num/2; i++){
            temp = num%i;
            if(temp ==0)
            isPrime = false;
            break;
        }
    if(isPrime)
        System.out.print(num +" "+ "number is prime");
     else{
        System.out.println(num +" " + "number is not prime");
     }
    }
}


//  java program to fond prime number

// public class Prime {

//     public static void main(String[] args) {
  
//       int num = 29;
//       boolean flag = false;
//       for (int i = 2; i <= num / 2; ++i) {
//         // condition for nonprime number
//         if (num % i == 0) {
//           flag = true;
//           break;
//         }
//       }
  
//       if (!flag)
//         System.out.println(num + " is a prime number.");
//       else
//         System.out.println(num + " is not a prime number.");
//     }
//   }
    

