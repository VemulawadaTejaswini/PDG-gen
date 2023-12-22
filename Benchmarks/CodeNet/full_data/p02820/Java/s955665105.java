import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int n = Integer.parseInt(sc.next());
    int k = Integer.parseInt(sc.next());

    int r = Integer.parseInt(sc.next());
    int s = Integer.parseInt(sc.next());
    int p = Integer.parseInt(sc.next());

    String t = sc.next();
    RSP[] enemyArray = toRspArray(t);
    RSP[] allWinArray = allWinArray(enemyArray);
    RSP[] strict = strict(allWinArray, k);

    long ans = 0;
    for (RSP rsp : strict) {
      switch (rsp) {
        case R:
          ans += r;
          break;
        case S:
          ans += s;
          break;
        case P:
          ans += p;
          break;
        case ANY:
          break;
      }
    }
    pw.println(ans);
  }

  static RSP[] toRspArray(String t) {
    RSP[] rsps = new RSP[t.length()];
    for (int i = 0; i < rsps.length; i++) {
      rsps[i] = RSP.of(String.valueOf(t.charAt(i)));
    }
    return rsps;
  }

  static RSP[] allWinArray(RSP[] enemy) {
    RSP[] rsps = new RSP[enemy.length];
    for (int i = 0; i < rsps.length; i++) {
      rsps[i] = enemy[i].toWin();
    }
    return rsps;
  }

  static RSP[] strict(RSP[] allWin, int k) {
    RSP[] strict = Arrays.copyOf(allWin, allWin.length);
    for (int i = 1; i <= k; i++) {
      for (int j = i - 1; j < strict.length; j += k) {
        int current = j;
        int next = j + k;
        int nextNext = next + k;
        if (next >= strict.length) {
          continue;
        }
        if (nextNext >= strict.length) {
          if (strict[current] == strict[next]) {
            strict[current] = RSP.ANY;
          }
          continue;
        }
        if (strict[current] == strict[next]) {
          if (strict[next] == strict[nextNext]) {
            strict[next] = RSP.ANY;
          } else {
            strict[current] = RSP.ANY;
          }
        }
      }
    }
    return strict;
  }

  enum RSP {
    R("r") {
      @Override
      RSP toWin() {
        return RSP.P;
      }
    },
    S("s") {
      @Override
      RSP toWin() {
        return RSP.R;
      }
    },
    P("p") {
      @Override
      RSP toWin() {
        return RSP.S;
      }
    },
    ANY("any") {
      @Override
      RSP toWin() {
        return RSP.ANY;
      }
    };

    RSP(String v) {
      this.v = v;
    }

    abstract RSP toWin();

    String v;

    static RSP of(String s) {
      return Arrays.stream(values()).filter(v -> s.equals(v.v)).findFirst().get();
    }
  }
}
