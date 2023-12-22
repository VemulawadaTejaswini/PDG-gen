import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arrT = new int[n];
    int[] arrA = new int[n];
    for (int i = 0; i < n; i++) {
      arrT[i] = sc.nextInt();
      arrA[i] = sc.nextInt();
    }
    sc.close();

    long t = arrT[0];
    long a = arrA[0];
    for (int i = 1; i < n; i++) {
      long mlt = 1;
      while (arrT[i] * mlt < t || arrA[i] * mlt < a) {
        mlt += 1;
      }
      t = arrT[i] * mlt;
      a = arrA[i] * mlt;
    }
    System.out.println(t + a);
  }
}
