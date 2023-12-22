import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    int a = N % 3;
    int b = N - a;
    int c = N / 3;

    System.out.println(c);
  }
}