import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args)throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int r = Integer.parseInt(str[0]);
    int d = Integer.parseInt(str[1]);
    int[] x = new int[11];
    x[0] = Integer.parseInt(str[2]);
    
    for(int i=0; i<10; i++) {
      x[i+1] = r * x[i] - d;
      System.out.println(x[i+1]);
    }
  }
}