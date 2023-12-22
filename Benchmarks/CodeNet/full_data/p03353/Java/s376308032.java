import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;


class Main {
  public static void main(String args[]){

    Scanner sc = new Scanner(System.in);

    String s = sc.next();

    int k = sc.nextInt();


    ArrayList<String> foo = new ArrayList<>();

    for (int i = 1; s.length() >= i; i++) {
      for (int n = 0; s.length() >= n + i; n++) {
        foo.add(s.substring(n, n + i));

      }
    }

    ArrayList<String> list = new ArrayList<String>(new HashSet<>(foo));
    Collections.sort(list);

    String str = list.get(k - 1);
    System.out.println(str);

    return;
  }
}
