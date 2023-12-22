import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int n = Integer.parseInt(str[0]);
    long k = Long.parseLong(str[1]);
    str = in.readLine().split(" ");
    long[] h = new long[n];
    long sum = 0;
    for(int i=0; i<n; i++) {
      h[i] = Long.parseLong(str[i]);
    }
    Arrays.sort(h);
    for(int i=0; i<n-k; i++) {
      sum += h[i];
    }
    System.out.println(sum);
  }
}