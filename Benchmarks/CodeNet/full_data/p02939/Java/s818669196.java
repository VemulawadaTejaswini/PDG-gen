import java.util.*;

public class Main {
  public static void main(String[] args) {
    String S;
    try(Scanner sc = new Scanner(System.in)) {
      S = sc.next();
    }
    System.out.println(solve(S));
  }
  
  private static int solve(String s) {
    String pre = "";
    List<String> tokenList = new LinkedList<>();
    int n = s.length();
    StringBuilder rest = new StringBuilder();
    for(int i = 0; i < n; i++) {
      String cand = s.substring(i, i+1);
      rest.append(cand);
      String strRest = rest.toString();
      if ( strRest.equals(pre) == false ) {
        tokenList.add(strRest);
        rest.delete(0, rest.length());
        pre = strRest;
      }
    }
    return tokenList.size();
  }
}