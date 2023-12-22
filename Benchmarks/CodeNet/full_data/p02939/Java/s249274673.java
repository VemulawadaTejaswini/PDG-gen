import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      char[] S = in.next().toCharArray();
      int prevStart = 0;
      int prevEnd = 1;
      int currStart = 1;
      int currEnd = 2;
      int count = 1;
      
      while (currEnd < S.length) {
        if (isEqual (prevStart, prevEnd, currStart, currEnd, S) == false) {
          ++count;
          prevStart = currStart;
          prevEnd = currEnd;
          currStart = currEnd;
          currEnd = currStart + 1;
        } else {
          ++currEnd;
        }
      }
      
      if (currStart < S.length) {
        if (isEqual (prevStart, prevEnd, currStart, currEnd, S) == false) {
          ++count; 
        }
      }

      System.out.println(count);
    }
  }

  static boolean isEqual (int prevStart, int prevEnd, int currStart, int currEnd, char[] s) {
    if (prevEnd - prevStart != currEnd - currStart) {
      return false;
    } else {
      int len = prevEnd - prevStart;

      for (int i = 0; i < len; ++i) {
        if (s[prevStart + i] != s[currStart + i]) {
          return false;
        }
      }

      return true;
    }
  }
}