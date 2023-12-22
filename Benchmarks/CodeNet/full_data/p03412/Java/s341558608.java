import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int N = sc.nextInt();
    int[] A = new int[N];
    int[] B = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }
    for (int i = 0; i < N; i++) {
      B[i] = sc.nextInt();
    }
    int ans = 0;
    for (int i = 0; i < 29; i++) {
      ArrayList<Integer> z = new ArrayList<>();
      ArrayList<Integer> o = new ArrayList<>();
      int mask = (1 << i) - 1;
      for (int j = 0; j < N; j++) {
        if ((B[j] & (1 << i)) == 0) {
          z.add(B[j] & mask);
        } else {
          o.add(B[j] & mask);
        }
      }
      Collections.sort(z);
      Collections.sort(o);
      int count = 0;
      for (int j = 0; j < N; j++) {
        int lower = A[j] & mask;
        if ((A[j] & (1 << i)) == 0) {
          // zero & carry or one & no carry
          count += z.size() - countNoCarry(z, mask - lower);
          count += countNoCarry(o, mask - lower);
        } else {
          // zero & no carry or one & carry
          count += countNoCarry(z, mask - lower);
          count += o.size() - countNoCarry(o, mask - lower);
        }
      }
      if (count % 2 == 1) ans |= 1 << i;
    }
    System.out.println(ans);
  }

  static int countNoCarry(ArrayList<Integer> list, int v) {
    int pos = Collections.binarySearch(list, v);
//    System.err.println("list:" + list + " pos:" + pos + " v:" + v);
    if (pos >= 0) {
      while (pos < list.size()) {
        if (list.get(pos) != v) break;
        pos++;
      }
    } else {
      pos = -pos - 1;
    }
    return pos;
  }

}
