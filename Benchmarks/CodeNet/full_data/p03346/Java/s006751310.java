import java.awt.geom.*;
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Main {
  private static PrintWriter pw;

  public static void main(String[] args) {
    pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();

    ArrayList<Integer> aList = new ArrayList<Integer>();

    Scanner sc = new Scanner(System.in);
    // 整数の入力
    int n = sc.nextInt();
    int count = 1;

    for (int i = 0; i < n; i++) {
      int tmp = sc.nextInt();
      aList.add(tmp);
    }

    for (int i = 0; i < n; i++) {
      int tmp = aList.get(i);
      boolean isNew = true;
      for (Integer key : map.keySet()) {
        ArrayList<Integer> list = map.get(key);
        if (list.get(list.size() - 1) + 1 == tmp) {

          count = Math.max(list.size() + 1, count);

          list.add(tmp);
          map.put(key, list);
          isNew = false;
        }
      }
      if (isNew) {
        map.put(tmp, new ArrayList<>(Arrays.asList(tmp)));
      }
    }

    pw.println(n - count);
    exitImmediately();
  }

  private static void exitImmediately() {
    pw.close();
    System.exit(0);
  }
}