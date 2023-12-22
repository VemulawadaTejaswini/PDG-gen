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
    
    String[] s = br.readLine().split(" ");
    long a = Long.parseLong(s[0]);
    long b = Long.parseLong(s[1]);
    long c = Long.parseLong(s[2]);
    long k = Long.parseLong(s[3]);
    if (k%2==0) {
      System.out.println(a-b);
    } else {
      System.out.println(-a+b);
    }
  }
}
