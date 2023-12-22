import java.util.*;
import java.math.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int right = 0;
    int penalty = 0;
    HashSet<Integer> set = new HashSet();
    for(int i = 0; i < m; ++i) {
      int index = sc.nextInt();
      String s = sc.next();
      if(set.contains(index)) continue;
      if(s.equals("AC")) {
        set.add(index);
        ++right;
      } else {
        ++penalty;
      }
    }
    System.out.println(right + " " + penalty);
  }
}