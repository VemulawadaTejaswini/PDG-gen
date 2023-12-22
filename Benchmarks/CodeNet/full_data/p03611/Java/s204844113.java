import java.util.Scanner;
import java.util.Arrays;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int[] a = new int[N];
    int count = 0;
    int ans = 0;
    for (int i = 0; i < N; i++){
      a[i] = scanner.nextInt();
    }
    Arrays.sort(a);
    for (int i = 0; i < N; i++){
      for (int j = 0; j < N; j++){
        if (a[i] == a[j]) {
          count++;
        } else if (a[i] == a[j] - 1){
          count++;
        } else if (a[i] == a[j] + 1){
          count++;
        }
        ans = Math.max(count, ans);
      }
      count = 0;
    }
    System.out.println(ans);
  }
}
