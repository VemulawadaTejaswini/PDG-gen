import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    boolean check = false;
    loop: for (int i = 1; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        if (a == i * j) {
          check = true;
          break loop;
        }
      }
    }
    System.out.println(check ? "Yes" : "No");
  }
}