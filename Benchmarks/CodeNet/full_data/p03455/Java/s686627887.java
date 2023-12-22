package p1;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int ans = a * b;
    if(ans % 2 == 0) {
      System.out.println("Even");
    } else {
      System.out.println("Odd");
    }
    scanner.close();

  }
}

