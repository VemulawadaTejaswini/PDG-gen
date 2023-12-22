import java.util.Scanner;
import java.util.Arrays;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String t=sc.next();
    t=t+t;
    System.out.println(t.contains(s)?"Yes":"No");
  }
}