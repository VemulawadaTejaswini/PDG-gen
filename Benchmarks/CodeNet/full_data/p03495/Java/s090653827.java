import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] a = new int[N];
    for (int i = 0; i < N; i++) {
      a[i] = sc.nextInt();
    }
    int[] num = new int[200001];
    for (int i = 0; i < num.length; i++) {
      num[i] = 200001;
    }
    for (int i = 0; i < N; i++) {
      if (num[a[i]] == 200001) {
        num[a[i]] = 0;
      }
      num[a[i]]++;
    }
    Arrays.sort(num);
    int kind = 0;
    for (int i = 0; i < num.length; i++) {
      if (num[i] < 200001) {
        kind++;
      }
    }
    int result = 0;
    for (int i = 0; i < kind - K; i++) {
      result += num[i];
    }
    System.out.println(result);
  }
}