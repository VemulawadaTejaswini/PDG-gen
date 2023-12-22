import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    String[] str = in.readLine().split(" ");
    int count = 0;
    int[] p = new int[n];
    for(int i=0; i<n; i++) {
      p[i] = Integer.parseInt(str[i]);
    }
    
    for(int i=1; i<n-1; i++) {
      if(p[i-1]<p[i] && p[i]<p[i+1] || p[i-1]>p[i] && p[i]>p[i+1])
        count+=1;
    }
    System.out.println(count);
  }
}