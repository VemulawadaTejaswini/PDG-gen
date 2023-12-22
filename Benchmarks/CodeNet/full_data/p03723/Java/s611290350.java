import java.io.*;
import java.util.*;
public class Main {
  public static void main(String[] args) throws Exception {
    String line = null;
    long aa = 0;
    long bb = 0;
    long cc = 0;
    long a2 = 0;
    long b2 = 0;
    long c2 = 0;
    long count = 0;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    line = br.readLine();
    String data[] = line.split(" ");
    aa = Long.parseLong(data[0]);
    bb = Long.parseLong(data[1]);
    cc = Long.parseLong(data[2]);
    while(true) {
      if ((aa == bb) && (aa == cc)) {
        System.out.println("-1");
        return;
      }
      if ((aa%2 != 0) || (bb%2 != 0) || (cc%2 != 0)) {
        System.out.println(count);
        return;
      }
      a2 = (bb + cc)/2;
      b2 = (aa + cc)/2;
      c2 = (aa + bb)/2;
      aa = a2;
      bb = b2;
      cc = c2;
      count = count + 1;
    }
  }
}