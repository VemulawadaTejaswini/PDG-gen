import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S,T;
    S = sc.next();
    T = sc.next();
    Set<Character> S_set = new HashSet<Character>();
    Set<Character> T_set = new HashSet<Character>();
    for(int i=0; i<S.length(); i++){
      S_set.add(S.charAt(i));
      T_set.add(T.charAt(i));
    }
    if(S_set.size() == T_set.size()) System.out.println("Yes");
    else System.out.println("No");
  }
}