import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int c = sc.nextInt();
    int[] imos = new int[100002];
    for(int i = 0; i < n; i++) {
      int s = sc.nextInt();
      int t = sc.nextInt();
      int u = sc.nextInt();
      imos[s]++;
      imos[t + 1]--;
    }
    for(int i = 1; i < 100002; i++) {
      imos[i] += imos[i - 1];
    }
    int ans = 0; 
    for(int i = 1; i < 100002; i++) {
      ans = Math.max(ans, imos[i]);
    }
    System.out.println(ans);
  }
}