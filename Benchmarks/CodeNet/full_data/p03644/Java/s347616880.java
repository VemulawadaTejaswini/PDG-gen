import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    int max = 0;
    for(int i=2; i<=n; i=i*2) {
        max = Math.max(max,i);
    }
    System.out.println(n==1?1:max);
  }
}