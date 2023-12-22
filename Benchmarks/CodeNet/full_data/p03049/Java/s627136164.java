import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String[] array = new String[N];
    for (int i = 0; i < N; i++) {
      array[i] = sc.next();
    }
    
    int ans = solve(array);

    System.out.println(ans);
    //System.out.println(Arrays.toString(array));
  }
  
  private static int solve(String[] strs) {
    int count = 0;
    int aEdge = 0;
    int bEdge = 0;
    int abEdge = 0;
    for (int i = 0; i < strs.length; i++) {
      String str = strs[i];
      if (str.length() >= 2) {
        if (str.charAt(0) == 'B' && str.charAt(str.length()-1) == 'A') {
          abEdge++;
        } else if (str.charAt(0) == 'B') {
          bEdge++;
        } else if (str.charAt(str.length()-1) == 'A') {
          aEdge++;
        }
        if (str.contains("AB")) {
          count++;
        }
      } else if (str.length() == 1) {
        if (str.charAt(0) == 'B') {
          bEdge++;
        } else if (str.charAt(0) == 'A') {
          aEdge++;
        }
      }
    }
    
    System.out.println("ab: " + abEdge + ", a: " + aEdge + ", b: " + bEdge + ", count: " + count);
    
    count = count + abEdge - 1;
    if (aEdge > 0) {
      count++;
      aEdge--;
    }
    if (bEdge > 0) {
      count++;
      bEdge--;
    }
    return count + Math.min(aEdge, bEdge);
  }
}  
