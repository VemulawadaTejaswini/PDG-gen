import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    String[] str = in.readLine().split(" ");
    int d = Integer.parseInt(str[0]);
    int x = Integer.parseInt(str[1]);
    int[] a = new int[n];
    int sum = 0;
    for(int i=0; i<n; i++) {
      a[i] = Integer.parseInt(in.readLine());
      for(int j=0; (j*a[i]+1)<=d; j++) {
        sum++;
      }
    }
    System.out.println(sum+x);
  }
}