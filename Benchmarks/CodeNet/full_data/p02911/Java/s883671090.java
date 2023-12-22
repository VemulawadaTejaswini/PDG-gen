import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    int n = stdIn.nextInt();
    int k = stdIn.nextInt();
    int q = stdIn.nextInt();
    int[] a = new int[q];
    for (int i = 0; i < q; i++) {
      a[i] = stdIn.nextInt();
    }

    int[] point = new int[n];
    for (int i = 0; i < n; i++) {
      point[i] = k;
    }

    for (int i = 0; i < q; i++) {
      for (int j = 0; j < n; j++) {
        if (j+1 != a[i]) {
          point[j]--;
        }
      }
    }

    for (int i = 0; i < n; i++) {
      if (point[i] > 0) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }
  }
}
