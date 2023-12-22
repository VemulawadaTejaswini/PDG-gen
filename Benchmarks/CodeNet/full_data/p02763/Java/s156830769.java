import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int n = Integer.parseInt(sc.next());
    String s = sc.next();
    char[] sArray = s.toCharArray();
    int q = Integer.parseInt(sc.next());
    CharIndexes indexesForAllAlphabet[] = new CharIndexes[27];
    for (int i = 0; i < 27; i++) {
      indexesForAllAlphabet[i] = new CharIndexes();
    }
    for (int i = 0; i < n; i++) {
      char c = sArray[i];
      int index = c - 'a';
      indexesForAllAlphabet[index].addIndex(i);
    }
    for (int query = 0; query < q; query++) {
      int type = Integer.parseInt(sc.next());
      if (type == 1) {
        int i = Integer.parseInt(sc.next()) - 1;
        char c = sc.next().charAt(0);
        indexesForAllAlphabet[sArray[i] - 'a'].removeIndex(i);
        sArray[i] = c;
        indexesForAllAlphabet[sArray[i] - 'a'].addIndex(i);
      } else {
        int l = Integer.parseInt(sc.next()) - 1;
        int r = Integer.parseInt(sc.next()) - 1;
        int ans = 0;
        for (CharIndexes indexes : indexesForAllAlphabet) {
          if (indexes.containsIndexRange(l, r)) {
            ans++;
          }
        }
        pw.println(ans);
      }
    }
  }

  static class CharIndexes {

    SortedSet<Integer> indexes = new TreeSet<>();

    void addIndex(int index) {
      indexes.add(index);
    }

    void removeIndex(int index) {
      indexes.remove(index);
    }

    boolean containsIndexRange(int from, int endInclusive) {
      return !indexes.subSet(from, endInclusive + 1).isEmpty();
    }
  }
}
