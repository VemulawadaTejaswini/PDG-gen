import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[] S = sc.next().toCharArray();
    int[] a = new int[26];
    for (char c : S) {
      a[c-'a'] = 1;
    }
    
    int count = 0;
    int minIndex = Integer.MAX_VALUE;
    for (int i = 0; i < a.length; i++) {
      if (a[i] == 1) {
        count++;
      } else {
        minIndex = Math.min(minIndex, i);
      }
    }
    
    System.out.println(count == 26 ? "None" : (char) ('a' + minIndex));
  }
}