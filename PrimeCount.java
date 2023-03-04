import java.util.Scanner;  
class Main {  
   public static void main(String[] args) {  
       Scanner s = new Scanner(System.in);  
       System.out.print("Enter the number : ");  
       int end = s.nextInt();  
      
       int count=0;
       for (int i = 1; i <= end; i++) { 
           
           if (isPrime(i)) {  
               count=count+1;
           }    
               
            
       }  
       System.out.print(count);
   }  
   public static boolean isPrime(int n) {  
       if (n <= 1) {  
           return false;  
       }  
       for (int i = 2; i <= Math.sqrt(n); i++) {  
           if (n % i == 0) {  
               return false;  
           }  
       }  
       return true;  
   }  
}  