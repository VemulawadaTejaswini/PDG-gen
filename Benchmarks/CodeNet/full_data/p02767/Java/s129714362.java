import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    String[] str = in.readLine().split(" ");
    int[] x = new int[n];
    int x_max = 0;
    int x_min = 100;
    int ans = 1000000000;
    for(int i=0; i<n; i++) {
      x[i] = Integer.parseInt(str[i]);
      x_max = Math.max(x_max,x[i]);
      x_min = Math.min(x_min,x[i]);
    }
    for(int i=x_min; i<=x_max; i++) {
      int sum = 0;
      for(int j=0; j<n; j++) {
        sum += Math.pow((x[j]-i),2);
      }
      ans = Math.min(sum,ans);
    }
    System.out.println(ans);
  }
}