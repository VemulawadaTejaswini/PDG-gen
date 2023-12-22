import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    int k = Integer.parseInt(in.readLine());
    int ans = 1;
    for(int i=0; i<n; i++) {
      ans = Math.min(ans*2,ans+k);
    }
    System.out.println(ans);
  }
}