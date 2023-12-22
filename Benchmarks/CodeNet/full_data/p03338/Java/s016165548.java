import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    try(Scanner sc = new Scanner(System.in)) {
      int N = sc.nextInt();
      String S = sc.next();
      char[] s = S.toCharArray();
      int answer = Integer.MIN_VALUE;
      for ( int i = 1; i < N-1; i++ ) {
        Set<Character> xSet = toCharacterSet(s, 0, i);
        Set<Character> ySet = toCharacterSet(s, i, N);
        Set<Character> pivotSet = null;
        Set<Character> counterSet = null;
        if ( xSet.size() < ySet.size() ) {
          pivotSet = xSet;
          counterSet = ySet;
        }
        else {
          pivotSet = ySet;
          counterSet = xSet;
        }
        int count = 0;
        for ( Character c : pivotSet ) {
          if ( counterSet.contains(c) ) {
            count++;
          }
        }
        if ( count > answer ) {
          answer = count;
        }
      }
      System.out.println(answer);
    }
  }
  
  private static Set<Character> toCharacterSet(char[] s, int start, int end) {
    Set<Character> ret = new HashSet<Character>();
    if ( s == null ) {
      return ret;
    }
    for ( int i = start; i < end; i++ ) {
      ret.add(s[i]);
    }
    return ret;
  }
}