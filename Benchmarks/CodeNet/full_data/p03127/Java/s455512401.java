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

    ArrayList<Integer> removeList = new ArrayList();
    for (int i=0; i<N; i++) {
      for (int j=N-1; j>=i+1; j--) {
        if (A.get(i) % A.get(j) == 0) {
          removeList.add(0, i);
          break;
        }
      }
    }

    //添字が大きいほうから削除していく
    for (int i=0; i<removeList.size(); i++) {
      A.remove((int)removeList.get(i));
    }

    int a = A.get(0);
    for (int i=1; i<A.size(); i++) {
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
