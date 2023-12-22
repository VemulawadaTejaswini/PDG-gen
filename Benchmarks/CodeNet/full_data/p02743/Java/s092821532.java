import java.util.Scanner;

class Main{
  public static void main(String args[]){
  
    Scanner stdIn = new Scanner(System.in);
   
    int a = stdIn.nextInt();
    int b = stdIn.nextInt();
    int c = stdIn.nextInt();
    
    if(Math.sqrt(a) + Math.sqrt(b) < Math.sqrt(c))
      System.out.println("Yes");
    else
      System.out.println("No");
  }
}