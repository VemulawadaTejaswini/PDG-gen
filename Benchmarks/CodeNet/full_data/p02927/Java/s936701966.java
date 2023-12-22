import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int count = 0;
    int[] array = new int[N];
    Arrays.setAll(array, i -> sc.nextInt());
    for (int i = 0; i < N - 1; i++)
      if (array[i] > array[i+1])
        count++;
    long result;
    if (array[N - 1] > array[0])
      result = (Long.valueOf(count + 1) * K - 1);
	else
      result = (Long.valueOf(count) * K);
    System.out.println(result % 1000000007);
  }
}