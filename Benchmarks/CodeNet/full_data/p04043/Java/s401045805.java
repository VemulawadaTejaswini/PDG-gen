import java.util.Scanner;

public class Main {
  private static final Scanner in = new Scanner(System.in);

  public static void main(String[] args) {
    int n = in.nextInt();
    int k = in.nextInt();
    int[] arr = new int[k];
    for (int i = 0; i < k; i++) {
      arr[i] = in.nextInt();
    }
    solve(n, arr);
  }

  private static void solve(int n, int[] arr) {
    for (int i = n; true; i++) {
      for (int j = 0; j < arr.length; j++) {
        if (String.valueOf(i).contains(String.valueOf(arr[j]))) {
          break;
        }
        if (j == arr.length - 1) {
          System.out.println(i);
          return;
        }
      }
    }
  }


}
