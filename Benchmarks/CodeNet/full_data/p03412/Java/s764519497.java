import java.util.Arrays;
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
      int countZ = 0;
      for (int j = 0; j < N; j++) {
        if ((B[j] & (1 << i)) == 0) {
          ++countZ;
        }
      }
      int[] z = new int[countZ];
      int[] o = new int[N - countZ];
      int pz = 0;
      int mask = (1 << i) - 1;
      for (int j = 0; j < N; j++) {
        if ((B[j] & (1 << i)) == 0) {
          z[pz++] = B[j] & mask;
        } else {
          o[j - pz] = B[j] & mask;
        }
      }
      Arrays.sort(z);
      Arrays.sort(o);
      int count = 0;
      for (int j = 0; j < N; j++) {
        int lower = A[j] & mask;
        if ((A[j] & (1 << i)) == 0) {
          // zero & carry or one & no carry
          count += z.length - countNoCarry(z, mask - lower);
          count += countNoCarry(o, mask - lower);
        } else {
          // zero & no carry or one & carry
          count += countNoCarry(z, mask - lower);
          count += o.length - countNoCarry(o, mask - lower);
        }
      }
      if (count % 2 == 1) ans |= 1 << i;
    }
    System.out.println(ans);
  }

  static int countNoCarry(int[] list, int v) {
    int pos = Arrays.binarySearch(list, v);
    if (pos >= 0) {
      while (pos < list.length) {
        if (list[pos] != v) break;
        pos++;
      }
    } else {
      pos = -pos - 1;
    }
    return pos;
  }

}
