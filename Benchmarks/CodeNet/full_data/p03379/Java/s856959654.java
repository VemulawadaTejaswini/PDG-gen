import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] nums = new int[N];
    for (int i = 0; i < N; i++) {
      nums[i] = sc.nextInt();
    }
    for (int i = 0; i < N; i++) {
      int[] numbers = new int[N];
      System.arraycopy(nums, 0, numbers, 0, N);
      numbers[i] = 0;
      Arrays.sort(numbers);
      System.out.println(numbers[N / 2]);
    }
  }
}