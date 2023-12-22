import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int N = in.nextInt();
    Tmp[] arr = new Tmp[N];

    for (int i = 0; i < N; i++) {
      arr[i] = new Tmp(in.nextLong(), in.nextLong());
    }

    Arrays.sort(arr);

    long anum = 0;
    long bnum = 0;

    for (int i = 0; i < N; i++) {
      if (i % 2 == 0) {
        anum += arr[i].a;
      } else {
        bnum += arr[i].b;
      }
    }

    System.out.println(anum - bnum);
  }

  /*
   * んー、これは何を改善すればとけるようになるのかがよくわからないな。。
   * 解説のとおりだと、一つが全部食べるというシミュレーションからかんがえるべきだったのかな？
   */

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
  long a;
  long b;

  public Tmp(long a, long b) {
    this.a = a;
    this.b = b;
  }

  public int compareTo(Tmp t) {
    // Sort in descending order.
    return (int) (t.a + t.b - a - b);
  }
}