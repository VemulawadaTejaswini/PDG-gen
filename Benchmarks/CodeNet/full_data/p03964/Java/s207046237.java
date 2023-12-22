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

    double t = arrT[0];
    double a = arrA[0];
    for (int i = 1; i < n; i++) {
      double mltT = Math.ceil(t / arrT[i]);
      double mltA = Math.ceil(a / arrA[i]);
      int mlt = mltT >= mltA ? (int) mltT : (int) mltA;
      t = arrT[i] * mlt;
      a = arrA[i] * mlt;
    }
    System.out.println((long) t + (long) a);
  }
}
