import java.util.*;

public class Main {

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

    int N = sc.nextInt();
    ArrayList<Integer> A = new ArrayList(N);

    for (int i=0; i<N; i++) {
      A.add(sc.nextInt());
    }

    int a = A.get(0);
    for (int i=1; i<A.size(); i--) {
      a = gcd(a, A.get(i));
    }

    System.out.println(a);
  }

  static int gcd(int a, int b) {
    if (b == 1) return 1;
    if (b == 0) return a;
    return gcd(b, a%b);
  }

}