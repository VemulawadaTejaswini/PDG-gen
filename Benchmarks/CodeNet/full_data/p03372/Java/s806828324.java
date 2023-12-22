import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());
    long C = Long.parseLong(sc.next());

    long x[] = new long[N];
    long v[] = new long[N];

    long getCalorieForward[] = new long[N];
    long sumV = 0;
    long maxForward = -1;
    int maxIndexForward = 0;

    for (int i = 0; i < N; i++) {
      x[i] = Long.parseLong(sc.next());
      v[i] = Long.parseLong(sc.next());
      sumV += v[i];
      getCalorieForward[i] = sumV - x[i];
      if (getCalorieForward[i] > maxForward) {
        maxForward = getCalorieForward[i];
        maxIndexForward = i;
      }
    }

    long getCalorieBack[] = new long[N];
    sumV = 0;
    long maxBack = -1;
    int maxIndexBack = 0;
    for (int i = 0; i < N; i++) {
      sumV += v[N - 1 - i];
      getCalorieBack[i] = sumV - C - x[N - 1 - i];
      if (getCalorieBack[i] > maxBack) {
        maxBack = getCalorieBack[i];
        maxIndexBack = N - 1 - i;
      }
    }

    if (maxForward < 0 && maxBack < 0) {
      System.out.println(0);
    } else if (maxForward < 0) {
      System.out.println(maxBack);
    } else if (maxBack < 0) {
      System.out.println(maxForward);
    } else if (maxIndexForward < maxIndexBack) {
      System.out.println(maxForward + maxBack);
    } else {
      System.out.println(Math.max(maxForward, maxBack));
    }

  }

}