import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int hight = 0;
    for (int i = b - a; i >=1; i--) {
      hight += i;
    }
    System.out.println(hight - b);
  }
}