import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int L = sc.nextInt();
    int R = sc.nextInt();
    int result = 99999;
    int tmp = 0;
    for (int i = L + 1; i <= R; i++) {
      tmp = (L * i) % 2019;
      if (tmp < result)
      	result = tmp;
    }
    System.out.println(result);
  }
}