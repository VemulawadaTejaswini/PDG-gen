import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    char[] S = scn.nextLine().toCharArray();
    char[] T = scn.nextLine().toCharArray();
    int size = S.length;

    HashMap<Character, Character> map = new HashMap<>();

    String ans = "Yes";
    for (int i = 0; i < size; i++) {
      if (!map.containsKey(S[i])) {
        map.put(S[i], T[i]);

      } else if (map.get(S[i]) != T[i]) {
        ans = "No";
        break;
      }

      if (!map.containsKey(T[i])) {
        map.put(T[i], S[i]);
      } else if (map.get(T[i]) != S[i]) {
        ans = "No";
        break;
      }
    }

    System.out.println(ans);
  }

}
