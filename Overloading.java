class Overloading {
  
    // Method 1 with one int parameter
    public void print(int a) {
      System.out.println("The value of a is: " + a);
    }
    
    // Method 2 with two int parameters
    public void print(int a, int b) {
        // int B = a + b;
      System.out.println("The value of a and b is: " +(a+b) );
    }
    
    // Method 3 with a double parameter
    public void print(double c) {
      System.out.println("The value of c is: " + c);
    }
    
    public static void main(String[] args) {
      Overloading obj = new Overloading();
      obj.print(10);
      obj.print(10, 20);
      obj.print(10.5);
    }
  }
  

  // In this program, we have three methods with the same name 'print' but
  // with different parameters. This is an example of method overloading in Java. 
  // The method to be called is determined by the number and type of arguments passed to the method.