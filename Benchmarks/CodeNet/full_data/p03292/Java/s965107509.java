import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a1 = sc.nextInt(); int a2 = sc.nextInt(); int a3 = sc.nextInt();
    int c12 = Math.abs(a1-a2);
    int c23 = Math.abs(a2-a3);
    int c31 = Math.abs(a3-a1);
    System.out.println(c12+c23+c31-Math.max(Math.max(c12, c23), c31));
  }
}