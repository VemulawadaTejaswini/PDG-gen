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
        if(list.contains(sub)) {
        } else {
          list.add(sub);
        }
      }
    }
    Collections.sort(list);
    System.out.println(list.get(k - 1));
  }
}