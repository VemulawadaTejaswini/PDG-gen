import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int a = x/500;
    int b = x - (a*500);
    int c = b/5;

    int ans1 = a*1000;
    int ans2 = c*5;

    System.out.println(ans1+ans2);
  }
}
