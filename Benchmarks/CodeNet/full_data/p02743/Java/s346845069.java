import java.util.Scanner;

class Main{
  public static void main(String args[]){
  
    Scanner stdIn = new Scanner(System.in);
   
    int a = stdIn.nextInt();
    int b = stdIn.nextInt();
    int c = stdIn.nextInt();
    
    double sqa = Math.sqrt(a);
    double sqb = Math.sqrt(b);
    double sqc = Math.sqrt(c);
    if(sqa + sqb < sqc)
      System.out.println("Yes");
    else
      System.out.println("No");
  }
}