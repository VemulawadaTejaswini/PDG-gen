import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);
  static int[] ans;
  static int both = 1;
  static int either = 1000000;
  static int special = -1;

  public static void main(String[] args) {
    int N = sc.nextInt();
    char[] S = sc.next().toCharArray();
    ans = new int[S.length + 1];
    boolean[] r = new boolean[S.length + 2];
    r[0] = r[S.length + 1] = true;
    for (int i = 0; i < S.length; i++) {
      r[i + 1] = S[i] == '1';
    }
    Segment first = null;
    Segment last = null;
    ArrayList<ArrayList<Segment>> segs = new ArrayList<>();
    for (int i = 0; i < 4; i++) {
      segs.add(new ArrayList<>());
    }
    int start = 0;
    for (int i = 1; i <= S.length + 1; i++) {
      if (r[i - 1] && !r[i]) {
        Segment seg = new Segment(start, i - start - 1);
        if (start == 0) {
          first = seg;
        } else {
          segs.get(seg.len % 4).add(seg);
        }
      }
      if (!r[i - 1] && r[i]) {
        start = i;
      }
    }
    last = new Segment(start, S.length + 1 - start);
//    if (first == null) first = last;
    int all = last.len;
    if (first != null) all += first.len;
    for (int i = 0; i < 4; i++) {
      all += segs.get(i).size() * i;
    }
    if (all % 2 != 0) {
      System.out.println("No");
      return;
    }
    if (all % 4 == 2) {
      ArrayList<Segment> circle = new ArrayList<>();
      if (segs.get(1).size() > 0) {
        circle.add(popback(segs.get(1)));
      } else if (segs.get(2).size() > 0 && segs.get(3).size() > 0) {
        circle.add(popback(segs.get(2)));
        circle.add(popback(segs.get(3)));
      } else if (segs.get(3).size() > 2) {
        circle.add(popback(segs.get(3)));
        circle.add(popback(segs.get(3)));
        circle.add(popback(segs.get(3)));
      }
      if (circle.isEmpty()) {
        System.out.println("No");
        return;
      }
      fillCircle(circle);
      System.err.println(Arrays.toString(ans));
    }
    ArrayList<Segment> chain = new ArrayList<>();
    if (first != null) chain.add(first);
    for (int i = 0; i < 4; i++) {
      chain.addAll(segs.get(i));
    }
    chain.add(last);
    fill(chain);
    int empty = 2000000;
    int bothCount = both / 2;
    int eitherCount = (either - 1000000);
    if (all % 4 == 2) {
      for (int i = 0; i < ans.length; i++) {
        if (ans[i] > 0 && ans[i] < 1000000) {
          if (ans[i] == special || ans[i] == special + 1) {
            ans[i] = both - 1 - (ans[i] - special);
          } else if (ans[i] > special) {
            ans[i] -= 2;
          }
        }
      }
    }
//    System.err.println("both:" + both + " eigher:" + either);
    for (int i = 0; i < ans.length; i++) {
      if (ans[i] == 0) {
        ans[i] = empty++;
      } else if (ans[i] < 1000000) {
        if (bothCount % 2 == 1 && ans[i] > both - 2) {
          ans[i] = (ans[i] + 1) / 2;
        } else {
          if (ans[i] % 2 == 0) {
            ans[i] = ans[i] / 2 + ans[i] / 2 % 2;
          } else {
            ans[i] = (ans[i] + 1) / 2 - ans[i] / 2 % 2;
          }
        }
      } else if (ans[i] < 2000000) {
        ans[i] = ans[i] - 1000000 + bothCount + 1;
      }
    }
    for (int i = 0; i < ans.length; i++) {
      if (ans[i] >= 2000000) {
        ans[i] = (ans[i] - 2000000) / 2 + bothCount + eitherCount + 1;
      }
    }

    System.out.println("Yes");
    for (int i = 0; i < ans.length; i++) {
      System.out.print(ans[i] + (i == ans.length - 1 ? "\n" : " "));
    }
  }

  static void fill(ArrayList<Segment> segs) {
//    System.err.println("segs:" + segs);
    for (int i = 0; i < segs.size(); i++) {
      Segment seg = segs.get(i);
      if (seg.start != 0) ans[seg.start - 1] = either + i - 1;
      for (int j = 0; j < seg.len; j++) {
        ans[seg.start + j] = both++;
      }
      if (i < segs.size() - 1) ans[seg.start + seg.len] = either + i;
    }
    either += segs.size() - 1;
  }

  static void fillCircle(ArrayList<Segment> segs) {
//    System.err.println("segs:" + segs);
    for (int i = 0; i < segs.size(); i++) {
      Segment seg = segs.get(i);
      Segment next = segs.get((i + 1) % segs.size());
      ans[seg.start - 1] = ans[next.start + next.len] = either + i;
      for (int j = 0; j < seg.len; j++) {
        ans[seg.start + j] = both++;
      }
    }
    special = both - 1;
    either += segs.size();
  }

  static <T> T popback(ArrayList<T> l) {
    T ret = l.get(l.size() - 1);
    l.remove(l.size() - 1);
    return ret;
  }

  static class Segment {
    int start, len;

    public Segment(int start, int len) {
      this.start = start;
      this.len = len;
    }

    @Override
    public String toString() {
      return "Segment{" +
          "start=" + start +
          ", len=" + len +
          '}';
    }
  }

}
