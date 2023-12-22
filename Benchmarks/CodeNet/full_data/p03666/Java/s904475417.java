/**
 * @author Finn Lidbetter
 */
import java.util.*;
import java.io.*;
import java.awt.geom.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    String[] s= br.readLine().split(" ");
    int n = Integer.parseInt(s[0]);
    long a = Long.parseLong(s[1]);
    long b = Long.parseLong(s[2]);
    long c = Long.parseLong(s[3]);
    long d = Long.parseLong(s[4]);
    b -= a;
    a = 0;
    if (b<0)
      b*=-1;
    long diff = d-c;
    long span = diff+1;
    long miss = 2*c-1;
    long fspan = span + (n-2)*diff;
    long fmiss = miss - (n-2)*diff;
    //System.out.printf("fspan: %d, fmiss: %d\n",fspan, fmiss);
    if (fmiss<=0) {
      if (b<(n-1)*d) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    } else {
      long period = fspan+fmiss;
      long max = (n-1)*d;
      if (b>max) {
        System.out.println("NO");
      } else {
        long bDiff = max-b;
        long moddedbDiff = bDiff % period;
        //System.out.printf("fspan: %d, fmiss: %d, period: %d, bDiff: %d, moddedbDiff: %d\n",fspan, fmiss, period, bDiff, moddedbDiff);
        if (moddedbDiff>=fspan) {
          System.out.println("NO");
        } else {
          System.out.println("YES");
        }
      }
    }
  }
}
