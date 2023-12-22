
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[][] a = new int[3][3];
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        a[i][j] = scanner.nextInt();
      }
    }
    int n = scanner.nextInt();
    for (int i = 0; i < n; i++) {
      int b = scanner.nextInt();
      for (int j = 0; j < 3; j++) {
        for (int k = 0; k < 3; k++) {
          if (a[j][k] == b) {
            a[j][k] = 0;
          }
        }
      }
    }
    int count1 = 0;
    int count2 = 0;
    int count3 = 0;
    int count4 = 0;
    for (int i = 0; i < 3; i++) {
      count1 = 0;
      count2 = 0;
      if (a[i][i] == 0) {
        count3++;
      }
      if (a[2 - i][2 - i] == 0) {
        count4++;
      }
      for (int j = 0; j < 3; j++) {
        if (a[i][j] == 0) {
          count1++;
        }
        if (a[j][i] == 0) {
          count2++;
        }
      }
      if (count1 == 3 || count2 == 3 || count3 == 3 || count4 == 3) {
        break;
      }
    }
    if (count1 == 3 || count2 == 3 || count3 == 3 || count4 == 3) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

  }
}

