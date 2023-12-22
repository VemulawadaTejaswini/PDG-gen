import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] a = new int[5];
    for (int i = 0; i < 5; i++) {
      a[i] = sc.nextInt();
    }
    Main abc123B = new Main();
    System.out.println(abc123B.solve(a));
  }

  public int solve(int[] a) {
    int ans = 0;
    int max_diff = 0;
    for(int i = 0; i < 5; i++ ){
      int diff = tenDiff(a[i]);
      ans += a[i] + diff;
      if(diff > max_diff){
        max_diff = diff;
      }
    }
    return ans - max_diff;
  }

  private int tenDiff(int a) {
    if (a % 10 == 0) {
      return 0;
    } else {
      return 10 - (a % 10);
    }
  }
}
