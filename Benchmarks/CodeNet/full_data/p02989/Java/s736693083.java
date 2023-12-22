import java.util.*;
public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] d = new int[N];
    for (int i = 0; i < N; i++) {
      d[i] = sc.nextInt();
    }
    Arrays.sort(d);
    
    int ans = 0;
    int mid = N/2;
    if (d[mid] != d[mid-1]) {
      ans = d[mid] - d[mid-1];
    }
    System.out.println(ans);
  }
}