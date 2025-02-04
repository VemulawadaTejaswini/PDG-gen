import java.util.*;

public class Main {
  static int N;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt();
    int[] A = new int[N];
    int[] B = new int[N];
    List<Cont> AA = new ArrayList<>();
    List<Cont> BB = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
      B[i] = sc.nextInt();
      AA.add(new Cont(i, A[i]));
      BB.add(new Cont(i, B[i]));
    }
    Collections.sort(AA);
    Collections.sort(BB);

    boolean[] done = new boolean[N];
    long sum = 0;
    for (int i = 0; i < N; i++) {
      if (i % 2 == 0) {
        sum += point(AA, BB, done);
      } else {
        sum -= point(BB, AA, done);
      }
    }
    System.out.println(sum);
  }

  static int point(List<Cont> M, List<Cont> E, boolean[] done) {

    if (done[M.get(0).i]) {
      M.remove(0);
    }

    if (done[E.get(0).i]) {
      E.remove(0);
    }

    if (M.get(0).v >= E.get(0).v) {
      done[M.get(0).i] = true;
      return M.get(0).v;
    } else {
      done[E.get(0).i] = true;
      return M.get(0).v;
    }
  }
}

class Cont implements Comparable<Cont> {
  int i;
  int v;

  Cont(int i, int v) {
    this.i = i;
    this.v = v;
  }

  @Override
  public int compareTo(Cont o) {
    return o.v - v;
  }
}
