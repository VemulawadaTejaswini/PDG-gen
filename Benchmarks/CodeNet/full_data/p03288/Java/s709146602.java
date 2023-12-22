import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    String str = "ABC";
    if(a >= 2800)str = "AGC";
    else if(a >= 1200)str = "ARC";
    System.out.println(str);
  }
}