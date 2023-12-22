import java.io.*;

public class Main{
  public static void main(String... args) throws IOException {
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    String line = stdin.readLine();
    String[] in = line.split(" ");
    int r = Integer.parseInt(in[0]);
    System.err.println(r);
    int g = Integer.parseInt(in[1]);
    System.err.println(g);
    int b = Integer.parseInt(in[2]);
    System.err.println(b);
    int n = Integer.parseInt(in[3]);
    System.err.println(n);

    int ret = 0;
    for (int i=0; i <= n/r; i++) {
      int rest1 = (n-r*i)/g;
      for (int j=0; j <= rest1; j++) {
        if ((n-r*i-g*j) % b != 0) {
          continue;
        }
        int rest2 = (n-r*i-g*j)/b;
        for (int k=0; k <= rest2; k++) {
          if (r*i + g*j + b*k == n) {
          	ret++;
          }
        }
      }
    }
    System.out.println(ret);
  }
}