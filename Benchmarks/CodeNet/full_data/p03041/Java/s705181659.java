import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();  // input Integer
    int a = sc.nextInt();  // input Integer
    String s = sc.next();  // input String
    System.out.println(s.substring(0,a-1)+s.substring(a-1,a).toLowerCase()+s.substring(a));
  }
}
