import java.util.*;
import java.io.*;

import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
  public static void main(String ... args) throws Exception {
    int n = 0, k = 0;
    String s;
    try (BufferedReader isr = new BufferedReader(new InputStreamReader(System.in))) {
      String buf = isr.readLine();
      System.err.println(buf);
      //
      String[] input = buf.split(" ");
      n = Integer.parseInt(input[0]);
      k = Integer.parseInt(input[1]);
      /*
      buf = isr.readLine();
      err.println(buf);
      // */
      s = buf;
    }

    err.println(log1p((double)k/n - 1));
    err.println(pow(0.5, (int)ceil(1.2)) / 3);
    double res = 0;
    for (int i=1; i<=n; i++) {
      double d = log1p((double)(k-i)/i - 1);
      err.println(d);
      res += pow(0.5, (int)ceil(d)+1) / n;
    }
    
    out.println(res);
  }

}
