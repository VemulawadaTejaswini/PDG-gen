import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double a = scan.nextInt();
    double b = scan.nextInt();
    double c = scan.nextInt();
    a=Math.sqrt(a);
    b=Math.sqrt(b);
    c=Math.sqrt(c);
    if(a+b<c){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }

  }
}