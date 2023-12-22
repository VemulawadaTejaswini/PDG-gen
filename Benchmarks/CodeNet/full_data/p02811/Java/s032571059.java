package abc149.SubE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    final int k = scanner.nextInt();
    final int x = scanner.nextInt();

    if(500 * k >= x) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }

}
