import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    String s = sc.next();
    String t = sc.next();
    sc.close();

    String[] S = s.split("");
    String[] T = t.split("");

    int i = 0;
    int j = 0;

    // TがSに含まれる（true）か否（false）か
    boolean flg = false;

    // ?を文字に変更するリスト
    HashMap<Integer, Integer> hashMap = new HashMap<>();

    while (i < S.length) {
      if (S[i].equals(T[j]) || S[i].equals("?")) {
        hashMap.put(i,j);
        if (j == T.length - 1) {
          flg = true;
          i = S.length;
        }
        j++;
      } else {
        hashMap.clear();
        j = 0;
      }
      i++;
    }

    String result = "UNRESTORABLE";

    if (flg) {
      for (Map.Entry<Integer, Integer> map : hashMap.entrySet()) {
        S[map.getKey()]  = T[map.getValue()];
      }
      result = "";
      for (int k = 0; k < S.length; k++) {
        if (S[k].equals("?")) {
          S[k] = "a";
        }
        result += S[k];
      }
    }

    System.out.println(result);

  }

}