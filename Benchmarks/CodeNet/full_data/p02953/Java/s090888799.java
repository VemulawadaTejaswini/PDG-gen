import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(in.readLine());
    String[] str = in.readLine().split(" ");
    
    int[] h = new int[n];
    for(int i=0; i<n; i++) {
      h[i] = Integer.parseInt(str[i]);
    }
    
    in.close();
    
    int max = 0;
    boolean hantei = true;
    for(int i=0; i<n; i++) {
       max = Math.max(h[i],max);
      if(max-1 > h[i]) {
        System.out.println("No");
        return;
      }
    }
    
    System.out.println("Yes");
  }
}