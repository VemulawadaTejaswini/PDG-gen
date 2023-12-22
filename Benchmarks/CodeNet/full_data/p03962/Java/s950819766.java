import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int cnt = 3;
    int a = sc.nextInt();
    int b = sc.nextInt();
    if (a == b) {
      cnt--;
    }
    int c = sc.nextInt();
    if (a == c || b == c) {
      cnt--;
    }
    System.out.println(cnt);

  }
}