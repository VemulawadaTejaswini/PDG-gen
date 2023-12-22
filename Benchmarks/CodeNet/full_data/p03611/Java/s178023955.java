import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    int[] a = new int[n];
    String[] str = in.readLine().split(" ");
    for(int i=0; i<n; i++) {
      a[i] = Integer.parseInt(str[i]);
    }
    
    Arrays.sort(a);
    
    int count = 0;
    int max = 0;
    for(int i=0; i<n-2; i++) {
      for(int j=0; j<n-2; j++) {
        if(Math.abs(a[i]-a[j])<=1) {
          count++;
        } else {
          max = Math.max(count,max);
          count = 0;
        }
      }
    }
    System.out.println(n==1?"1":max);
  }
}