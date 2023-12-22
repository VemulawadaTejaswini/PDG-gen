import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int n = Integer.parseInt(str[0]);
    int l = Integer.parseInt(str[1]);
    int ans = 0;
    if(l>=0){
      for(int i=2; i<=n; i++) {
        ans += (l+i-1);
      }
    } else if(l<0 && l+n<0) {
      for(int i=1; i<n; i++) {
        ans += (l+i-1);
      }
    } else {
      for(int i=1; i<=n; i++) {
        ans += (l+i-1);
      }
    }
    System.out.println(ans);
  }
}