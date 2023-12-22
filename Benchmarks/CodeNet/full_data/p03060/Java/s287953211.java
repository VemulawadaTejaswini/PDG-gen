import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args)throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    int[] v = new int[n];
    int[] c = new int[n];

    String[] str = in.readLine().split(" ");
    for(int i=0; i<n; i++) {
      v[i] = Integer.parseInt(str[i]);
    }
    str = in.readLine().split(" ");
    for(int i=0; i<n; i++) {
      c[i] = Integer.parseInt(str[i]);
    }
    
    int diff = 0;
    int ans = 0;
    for(int i=0; i<n; i++) {
      diff = v[i]-c[i];
      if(diff>0)
        ans += diff;
    }
    
    System.out.println(ans);
  }
}