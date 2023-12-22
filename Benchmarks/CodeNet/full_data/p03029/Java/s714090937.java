import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    int A = in.nextInt();
    int P = in.nextInt();
    
    System.out.println((int)((A*3+P)/2));
  }
}