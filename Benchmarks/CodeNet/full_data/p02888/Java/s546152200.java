import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] l = new int[n];
    for (int i = 0; i < n; i++) {
      l[i] = sc.nextInt();
    }
    int res = 0;
    for (int i = 0; i < l.length - 2; i++) {
      for (int j = i + 1; j < l.length - 1; j++) {
        for (int k = j + 1; k < l.length; k++) {
          if (l[i] < l[j] + l[k] && l[j] < l[i] + l[k] && l[k] < l[j] + l[i]) {
            res++;
          }
        }
      }
    }
    System.out.println(res);
  }
}
