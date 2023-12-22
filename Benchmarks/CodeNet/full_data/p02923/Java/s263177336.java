import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args)throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    String[] str = in.readLine().split(" ");
    int[] h = new int[n];
    int count = 0;
    int ans = 0;
    for(int i = 0; i<n; i++) {
      h[i] = Integer.parseInt(str[i]);
      if(i==0)
        continue;
      if(h[i-1]>=h[i]){
        count += 1;
        ans = Math.max(ans,count);
      }else{
        count = 0;
      }
    }
    System.out.println(ans);
  }
}