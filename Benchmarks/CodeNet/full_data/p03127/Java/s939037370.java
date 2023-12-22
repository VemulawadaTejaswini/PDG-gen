import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    ArrayList<Integer> A = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      A.add(sc.nextInt());
    }
    while (true) {
      Collections.sort(A);
      int ch = 0;
      while (A.remove((Integer) 0)) {
      }
      for (int i = 1; i < A.size(); i++) {
        A.set(i, A.get(i) % A.get(0));
        ch += A.get(i);
      }
      if (ch == 0) {
        System.out.println(A.get(0));
        return;
      }
      if (A.get(0) == 1) {
        System.out.println(1);
      }
    }
  }
}