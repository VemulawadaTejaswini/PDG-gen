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

    HashMap<Integer, Integer> table = new HashMap<Integer, Integer>();

    for (int i = 0; i < n; i++) {
      int tmp = sc.nextInt();
      aList.add(tmp);
      table.put(tmp - 1, 0);
    }

    table.put(aList.get(0), 1);

    for (int i = 1; i < n; i++) {
      table.put((aList.get(i)), table.get(aList.get(i) - 1) + 1);

      if (count < table.get(aList.get(i))) {
        count = table.get(aList.get(i));
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