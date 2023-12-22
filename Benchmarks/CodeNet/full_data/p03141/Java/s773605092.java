import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int N = in.nextInt();
    Tmp[] a = new Tmp[N];
    Tmp[] b = new Tmp[N];
    HashMap<Integer, long[]> map = new HashMap<>();

    for (int i = 0; i < N; i++) {
      a[i] = new Tmp(i, in.nextLong());
      b[i] = new Tmp(i, in.nextLong());
      map.put(i, new long[]{a[i].v, b[i].v});
    }

    Arrays.sort(a);
    Arrays.sort(b);

    HashSet<Integer> usedIndex = new HashSet<Integer>();
    long anum = 0;
    long bnum = 0;
    int aindex = 0;
    int bindex = 0;

    for (int i = 0; i < N; i++) {
      while (usedIndex.contains(a[aindex].index)) {
        aindex++;
      }
      while (usedIndex.contains(b[bindex].index)) {
        bindex++;
      }

      boolean aused = true;
      int index = 0;

      if (a[aindex].v > b[bindex].v) {
        index = a[aindex].index;
        aindex++;
      } else {
        aused = false;
        index = b[bindex].index;
        bindex++;
      }
      usedIndex.add(index);

      if (i % 2 == 0) {
        anum += map.get(index)[0];
      } else {
        bnum += map.get(index)[1];
      }
    }

    System.out.println(anum - bnum);
  }

  public static int gcd(int a, int b) {
        if (b == 0) return a;
    return gcd(b, a % b);

  }

  public static long gcd(long a, long b) {
    if (b == 0) return a;
    return gcd(b, a % b);
  }
}

class Tmp implements Comparable<Tmp> {
  int index;
  long v;

  public Tmp(int index, long v) {
    this.index = index;
    this.v = v;
  }

  public int compareTo(Tmp t) {
    // Sort by descending order.
    return (int) (t.v - this.v);
  }
}