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
    String s = br.readLine();
    int min = 987654321;
    for (char i=0; i<26; i++) {
      int val = count(s,(char)('a'+i));
      if (val<min) {
        min = val;
      }
    }
    System.out.println(min);

  }
  public static int count(String s, char target) {
    StringBuilder sb = new StringBuilder();
    for (int i=0; i<s.length(); i++) {
      sb.append(target);
    }
    int count = 0;
    StringBuilder sb2 = new StringBuilder(s);
    while (!s.equals(sb.toString())) {
      sb2 = new StringBuilder();
      for (int i=0; i<sb.length()-1; i++) {
        if (s.charAt(i)==target || (s.charAt(i+1)==target)) {
          sb2.append(target);
        } else {
          sb2.append(s.charAt(i));
        }
      }
      count++;
      sb.delete(sb.length()-1, sb.length());
      s = sb2.toString();
    }
    return count;
  }
}
