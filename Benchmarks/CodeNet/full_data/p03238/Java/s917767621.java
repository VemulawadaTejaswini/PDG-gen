import java.util.Scanner;
 
public class Main{
  public static void main(String[] arg){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if(n==1){
      System.out.println("Hello World");
      System.exit(0);
    }
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println(a+b);
  }
}