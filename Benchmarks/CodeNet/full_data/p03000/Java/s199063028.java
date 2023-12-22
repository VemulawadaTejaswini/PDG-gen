import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int n = Integer.parseInt(str[0]);
    int x = Integer.parseInt(str[1]);
    int[] l = new int[n];
    int count = 1;
    str = in.readLine().split(" ");
    for(int i=0; i<n; i++) {
      l[i] = Integer.parseInt(str[i]);
    }
    int[] d = new int[n+1];
    d[0] = 0;
    for(int j=1; j<n; j++) {
      d[j] = d[j-1] + l[j-1];
      if(d[j]<=x)
        count+=1;
    }
    System.out.println(count);
  }
}