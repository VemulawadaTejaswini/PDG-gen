import java.util.*;

public class Main {

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

    int N = sc.nextInt();
    ArrayList<Integer> A = new ArrayList(N);

    for (int i=0; i<N; i++) {
      A.add(sc.nextInt());
    }

    A.sort((x, y) -> y-x);
    
    int min = A.get(0);

    for (int i=0; i<A.size(); i++) {
      for (int j=i+1; j<A.size(); j++) {
        min = Math.min(min, gcd(A.get(i), A.get(j)));
        A.set(i, min);
        A.set(j, min);
      }
    }

    System.out.println(min);
  }

  static int gcd(int a, int b) {
    if (b == 1) return 1;
    if (b == 0) return a;
    return gcd(b, a%b);
  }

}