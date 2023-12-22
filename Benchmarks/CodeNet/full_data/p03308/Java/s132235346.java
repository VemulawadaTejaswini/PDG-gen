import java.util.Scanner;

public class Main {
  public static void main(String ...args) {
    final Scanner scanner = new Scanner(System.in);
    final int length = scanner.nextInt();
    final int[] numbers = new int[length];
    for (int idx = 0; idx < length; idx++) {
      numbers[idx] = scanner.nextInt();
    }

    final int result = maximumDifference(length, numbers);
    System.out.println(result);
  }

  public static int maximumDifference(final int N, final int[] A) {
    int maxDiff = 0;
    for (int currentIdx = 0; currentIdx < N; currentIdx++) {
      for (int otherIdx = 0; otherIdx < N; otherIdx++) {
        if (currentIdx == otherIdx) continue;

        final int diff = A[currentIdx] - A[otherIdx];
        maxDiff = maxDiff < diff ? diff : maxDiff;
      }
    }

    return maxDiff;
  }
}
