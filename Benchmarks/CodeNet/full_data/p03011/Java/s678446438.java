import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();  // input Integer
    int b = sc.nextInt();  // input Integer
    int c = sc.nextInt();  // input Integer
    int max = Math.max(a,b);
    max = Math.max(max,c);
    System.out.println(a+b+c-max);
//    String a = sc.next();  // input String
  }
}