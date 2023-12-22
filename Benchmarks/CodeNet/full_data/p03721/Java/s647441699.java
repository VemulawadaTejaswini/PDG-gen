import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    long K = scanner.nextLong();
    NumCount[] nums = new NumCount[N];
    for (int i = 0; i < N; i++) {
      nums[i] = new NumCount(scanner.nextInt(), scanner.nextInt());
    }
    Arrays.sort(nums);

    long c = 0;
    for (NumCount n : nums) {
      c += n.count;
      if (c >= K) {
        System.out.println(n.num);
        return;
      }
    }
  }

  private static class NumCount implements Comparable<NumCount> {
    final int num;
    final int count;

    private NumCount(int num, int count) {
      this.num = num;
      this.count = count;
    }

    @Override public int compareTo(NumCount o) {
      return this.num - o.num;
    }
  }
}
