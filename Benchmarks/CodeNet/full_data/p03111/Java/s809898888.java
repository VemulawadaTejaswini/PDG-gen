import java.util.*;

public class Main {

  static Scanner sc = new Scanner(System.in);

  static int N;
  static ArrayList<Integer> original;
  static ArrayList<Integer> list;

  public static void main(String[] args) {
    N = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();

    original = new ArrayList(N);

    for (int i=0; i<N; i++) {
      original.add(sc.nextInt());
    }

    int minMP = Integer.MAX_VALUE;

    minMP = Math.min(minMP, g(A,B,C));
    minMP = Math.min(minMP, g(A,C,B));
    minMP = Math.min(minMP, g(B,A,C));
    minMP = Math.min(minMP, g(B,C,A));
    minMP = Math.min(minMP, g(C,A,B));
    minMP = Math.min(minMP, g(C,B,A));

    System.out.println(minMP);

  }

  static int g(int a, int b, int c) {
    list = new ArrayList();
    for (int i=0; i<N; i++) {
      list.add(original.get(i));
    }
    return f(a) + f(b) + f(c);
  }

  static int f(int len) {
    int[] index = new int[2];
    int minDif = Integer.MAX_VALUE;
    int mp = 0;

    boolean marged = true;
    while(marged) {
      marged = false;
      for (int i = 0; i < list.size(); i++) {
        int dif = Math.abs(list.get(i) - len);
        if (dif < minDif) {
          index[0] = i;
          index[1] = -1;
          minDif = dif;
        }
      }

      for (int i = 0; i < list.size(); i++) {
        for (int j = i + 1; j < list.size(); j++) {
          int dif = Math.abs((list.get(i) + list.get(j)) - len);
          if ((index[1] == -1 && dif < minDif - 10) ||
                  (index[1] != -1 && dif < minDif)) {
            index[0] = i;
            index[1] = j;
            minDif = dif;
            marged = true;
          }
        }
      }

      if (marged) {
        mp += 10;
        list.set(index[0], list.get(index[0]) + list.get(index[1]));
        list.remove(index[1]);
      }
    }

    list.remove(index[0]);

    return mp + minDif;
  }


}
