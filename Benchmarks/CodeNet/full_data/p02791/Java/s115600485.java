import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    String[] str = in.readLine().split(" ");
    int[] p = new int[n];
    int count = 0;
    for(int i=0; i<n; i++) {
      p[i] = Integer.parseInt(str[i]);
      for(int j=0; j<i; j++) {
        if(p[i]-p[j]>0) {
          count++;
          break;
        }
      }
    }
    System.out.println(n-count);
  }
}