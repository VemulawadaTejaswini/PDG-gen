import java.io.*;

public class Main {
  
  static int n, x, y;

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] in;
    in = br.readLine().split(" ");
    n = Integer.parseInt(in[0]);
    x = Integer.parseInt(in[1]);
    y = Integer.parseInt(in[2]);

    br.close();

    x--; y--;
    int c = (x + y + 1) / 2;
    int[] ans = new int[n];

    for(int i = 0; i < n-1; i++){
      for(int j = i+1; j < n; j++){
        int dist = Math.min(j - i, (Math.abs(x - i) + Math.abs(y - j) + 1));
        ans[dist]++;
      }
    }
    
    for(int i = 1; i < n; i++){
      System.out.println(ans[i]);
    }
  }
}