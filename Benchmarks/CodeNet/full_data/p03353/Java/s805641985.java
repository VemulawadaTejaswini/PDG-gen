import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      String s = in.next();
      int K = in.nextInt();
      TreeSet<String> substrs = new TreeSet<String>();

      for (int start = 0; start < s.length(); ++start) {
        for (int end = start + 1; end <= s.length(); ++end) {
          substrs.add(s.substring(start, end));
        }
      }       
    
      while (K > 1) {
        substrs.pollFirst();
        --K;
      }
      
      System.out.println(substrs.first());
    }
  }
}
