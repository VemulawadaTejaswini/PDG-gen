import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.regex.Pattern;


class Rp1ABC097C {
  public static void main(String args[]){

    Scanner sc = new Scanner(System.in);

    String s = sc.next();

    int k = sc.nextInt();

    if (s.length() <= 0 || 5000 < s.length() || k <= 0 || 5 < k ) {
      return;
    }
    for(int t = 1; s.length() >= t; t++) {
      if (!Pattern.matches("^[a-z]+$", s)) {
        return;
      }
    }


    ArrayList<String> foo = new ArrayList<>();

    for (int i = 1; s.length() >= i; i++) {
      for (int n = 0; s.length() >= n + i; n++) {
        foo.add(s.substring(n, n + i));
      }
    }

    if (foo.size() < k) {
      return;
    }

    ArrayList<String> list = new ArrayList<String>(new HashSet<>(foo));
    Collections.sort(list);

    String str = list.get(k - 1);
    System.out.println(str);

    return;
  }
}
