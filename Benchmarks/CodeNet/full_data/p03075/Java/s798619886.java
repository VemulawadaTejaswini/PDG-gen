import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] p = new int[5];
    int k;
    for (int i = 0; i < 5; i++) {
      p[i] = scanner.nextInt();
    }
    k = scanner.nextInt();
    boolean ans = true;
    for (int i = 0; i < 5; i++) {
      for (int j = i; j < 5; j++) {
        if (p[j] - p[i] > k) {
          ans = false;
        }
      }
    }
    System.out.println(ans ? "Yay!" : ":(");
  }

}
