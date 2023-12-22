import java.io.*;
import java.util.*;
public class Main {
  public static void main(String[] args) throws Exception {
    String line = null;
    long sum = 0L;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    line = br.readLine();
    String data[] = line.split(" ");
    long n = Long.parseLong(data[0]);
    long x = Long.parseLong(data[1]);
    //System.out.println("N=" + n + ",X=" + x);
    long a = 0L; // 短辺の長さ
    long b = 0L; // 長辺の長さ
    long c = 0L; // 正三角形の数
    long d = 0L; // 長辺の残り
    long cnt = 0L;

    while (true) {
      if (cnt == 0L) {
        if (x >= (n - x)) {
          a = n - x;
          b = x;
        } else {
          a = x;
          b = n - x;
        }
      } else {
        b = a;
        a = d;
      }
      c = b / a;
      d = b % a;
      sum = sum + (c * 3L * a);
      //System.out.println("a=" + a + ",b=" + b + ",c=" + c + ",d=" + d + ",sum=" + sum);
      if (d == 0L) {
        break;
      }
      cnt = cnt + 1L;
    }
    System.out.println(sum);
  }
}