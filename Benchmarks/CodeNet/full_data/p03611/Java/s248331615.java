import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    
    int count = 0;
    int max = 0;
    for (int i = 0; i < a.length; i++) {
      count = 0;
      for (int j = 0; j < a.length; j++) {
        if (a[i] + 1 == a[j]) {
          count++;
        } else if (a[i] - 1 == a[j]) {
          count++;
        } else if (a[i] == a[j]) {
          count++;
        }
        if (count > max) {
          max = count;
        }
      }
    }
    System.out.println(max);
  }
}
