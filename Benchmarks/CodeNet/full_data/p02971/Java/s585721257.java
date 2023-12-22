import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner (System.in);

    while (in.hasNext()) {
      int N = in.nextInt();
      int[] A = new int[N];
      int max = 0;
      int maxIdx = -1;

      for (int i = 0; i < A.length; ++i) {
        A[i] = in.nextInt();

        if (A[i] > max) {
          max = A[i];
          maxIdx = i;
        }
      }

      int sndMax = 0;      
      int sndMaxIdx = -1;
      for (int i = 0; i < A.length; ++i) {
        if (A[i] > sndMax && i != maxIdx) {
          sndMax = A[i];
          sndMaxIdx = i;
        }
      }

      for (int i = 0; i < A.length; ++i) {
        if (i != maxIdx) {
          System.out.println(max);
        } else {
          System.out.println(sndMax);
        }
      }
    }
  }
}