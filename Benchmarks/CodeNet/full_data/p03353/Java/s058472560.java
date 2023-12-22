import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int k = sc.nextInt();
    ArrayList<String> list = new ArrayList<String>();
    for(int i = 0; i < s.length(); i++) {
      for(int j = i; j < s.length(); j++) {
        String sub = "";
        if(j == s.length() - 1) {
          sub = String.valueOf(s.substring(i));
        } else {
          sub = String.valueOf(s.substring(i, j + 1));
        }
        list.add(sub);
      }
    }
    Collections.sort(list);
    String a = "";
    String[] ans = new String[k];
    ans[0] = list.get(0);
    a = ans[0];
    int p = 1;
    for(int i = 1; i < list.size(); i++) {
      if(a.equals(list.get(i))) {
        
      } else {
        ans[p] = list.get(i);
        a = ans[i];
        p++;
      }
      if(p == k) break;
    }
    System.out.println(ans[k - 1]);
  }
}