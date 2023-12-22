import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    ArrayList<String> a = new ArrayList<>();//上司の番号
    //上司の社員番号を入れる
    for (int i = 0; i < n - 1; i++) {
      a.add(sc.next());
    }
    TreeSet<String> test = new TreeSet<>(a);
    for (String s : test) {
      int cnt = 0;
      for (String m : a) {
        if (s.equals(m)) {
          cnt++;
        }
      }
      System.out.println(cnt);
    }
    for (int i = 0; i < a.size() - test.size(); i++) {
      System.out.println(0);
    }
  }
}