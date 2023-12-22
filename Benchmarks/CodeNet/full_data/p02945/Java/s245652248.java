import java.util.*;
public class Main{
  public static void main(String[] mains){
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println(Math.max(a+b,Math.max(a-b,a*b)));
  }
}