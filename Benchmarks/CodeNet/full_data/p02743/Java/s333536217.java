import java.util.Scanner;

class Main{
  public static void main(String args[]){
  
    Scanner stdIn = new Scanner(System.in);
   
    long a = stdIn.nextLong();
    long b = stdIn.nextLong();
    long c = stdIn.nextLong();
    
    if(a + 2 * Math.sqrt(a * b) + b < c)
      System.out.println("Yes");
    else
      System.out.println("No");
  }
}