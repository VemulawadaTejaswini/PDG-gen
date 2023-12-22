import java.io.*;
import java.util.*;
public class Main {
  public static void main(String[] args) throws Exception {
    String line = null;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int aa = Integer.parseInt(br.readLine());
    int bb = Integer.parseInt(br.readLine());
    int cc = Integer.parseInt(br.readLine());
    int xx = Integer.parseInt(br.readLine());
    int count = 0;
    for (int i = 0; i <= aa; i ++) {
      if (500 * i > xx) continue;
      for (int j = 0; j <= bb; j ++) {
        if ((500 * i + 100 * j) > xx) continue;
        for (int k = 0; k <= cc; k ++) {
          int val = 500 * i + 100 * j + 50 * k;
          if (val == xx ) count = count + 1;
          //System.out.println(i + "," + j + "," + k + "," + val + "," + count);
        }
      }
    }
    System.out.println(count);
  }
}