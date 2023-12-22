import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int n = Integer.parseInt(str[0]);
    int x = Integer.parseInt(str[1]);
    int[] m = new int[n];
    int sum = 0;
    int min = 1000;
    for(int i=0; i<n; i++) {
      m[i] = Integer.parseInt(in.readLine());
      sum += m[i];
      min = Math.min(min,m[i]);
    }
    System.out.println(n+((x-sum)/min));
  }
}