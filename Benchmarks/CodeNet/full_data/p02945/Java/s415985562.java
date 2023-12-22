import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int[] p = {a+b, a-b, a*b};
    Arrays.sort(p);
    System.out.println(p[2]);
  }
}