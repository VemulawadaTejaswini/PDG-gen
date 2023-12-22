import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] list = new int[n - 1];
    int[] results = new int[n];

    for (int i = 0; i < list.length; i++) {
      list[i] = sc.nextInt();
    }
    for (int i = 1; i < results.length; i++) {
      results[i] = 0;
    }

    for (int i = 0; i < list.length; i++) {
      results[(list[i]) - 1]++;
    }
    for (int i = 0; i < results.length; i++) {
      System.out.println(results[i]);
    }
    sc.close();
  }
}