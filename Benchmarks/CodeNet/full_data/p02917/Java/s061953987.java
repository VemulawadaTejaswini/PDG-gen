import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    String[] str = in.readLine().split(" ");
    int[] b = new int[n-1];
    for(int i=0; i<n-1; i++) {
      b[i] = Integer.parseInt(str[i]);
    }
    
    int aSum = b[0]+b[n-2];
    for(int i=0; i<n-2; i++) {
      aSum += Math.min(b[i],b[i+1]);
    }
    
    System.out.println(aSum);
  }
}