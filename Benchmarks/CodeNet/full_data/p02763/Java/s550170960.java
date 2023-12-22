import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    char[] S = scanner.next().toCharArray();
    BinaryIndexTree[] trees = new BinaryIndexTree[26];
    for (int i = 0; i < 26; i++) trees[i] = new BinaryIndexTree(N);
    for (int i = 1; i <= N; i++) {
      trees[S[i - 1] - 'a'].add(i, 1);
    }

    int Q = scanner.nextInt();
    for (int i = 0; i < Q; i++) {
      int type = scanner.nextInt();
      switch (type) {
        case 1:
          int idx = scanner.nextInt();
          char ch = scanner.next().charAt(0);
          trees[S[idx - 1] - 'a'].add(idx, -1);
          trees[ch - 'a'].add(idx, 1);
          S[idx - 1] = ch;
          break;
        case 2:
          int l = scanner.nextInt();
          int r = scanner.nextInt();
          int count = 0;
          for (int j = 0; j < 26; j++) {
            int f = trees[j].compute(r) - trees[j].compute(l - 1);
            if (f > 0) count++;
          }
          System.out.println(count);
          break;
      }
    }
  }

  public static class BinaryIndexTree {
    private final int[] a;

    public BinaryIndexTree(int size) {
      a = new int[size + 1];
    }

    public int compute(int index) {
      int res = 0;
      while (index > 0) {
        res += a[index];
        index -= index & -index;
      }
      return res;
    }

    public void add(int index, int value) {
      while (index < a.length) {
        a[index] += value;
        index += index & -index;
      }
    }
  }
}
