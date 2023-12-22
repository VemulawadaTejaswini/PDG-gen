import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();

        int[] A = new int[M];
        int[] B = new int[M];

        for (int i = 0; i < M; i++) {
            A[i] = in.nextInt() - 1;
            B[i] = in.nextInt() - 1;
        }

        List<Long> ans = new ArrayList<Long>(Arrays.asList(new Long[M]));
        ans.set(M - 1, (long) N * (N - 1) / 2); // 最初は全ノード独立しているので不便さはnC2

        UnionFind uni = new UnionFind(N);
        for (int i = M - 1; i >= 1; i--) {
            ans.set(i - 1, ans.get(i));

            if (uni.root(A[i]) != uni.root(B[i])) {
                long temp = uni.size(A[i]) * uni.size(B[i]);
                ans.set(i - 1, ans.get(i - 1) - temp);
                uni.connect(A[i], B[i]);
            }
        }

        for (int i = 0; i < M; i++) {
            System.out.println(ans.get(i));
        }
    }

    static class UnionFind {
        List<Integer> parent; // parent.get(i)でiの親が取得出来る.親だった場合は「-1 * その集合のサイズ」を持つ

        UnionFind(int N) {
            parent = new ArrayList<Integer>();
            Integer[] values = new Integer[N];
            Arrays.fill(values, -1);
            parent.addAll(Arrays.asList(values)); // 最初は全ノード独立している「独立=親が-1」で表す。
        }

        int root(int A) {
            if (parent.get(A) < 0) {
                // 自分が親
                return A;
            }
            int root = root(parent.get(A)); // 自分の親を渡して再帰処理
            parent.set(A, root); //せっかく再帰関数で親を取得したので、その結果で更新しておく
            return root;
        }

        int size(int A) {
            return -parent.get(root(A));
        }

        boolean connect(int A, int B) {
            A = root(A);
            B = root(B);
            if (A == B) {
                return false;
            }

            // 大きい方に小さい方を付けたい
            if (size(A) < size(B)) {
                int temp = A;
                A = B;
                B = temp;
            }

            parent.set(A, parent.get(A) + parent.get(B));  // Aのサイズを変更
            parent.set(B, A);                              // Bの親をAに変更

            return true;
        }
    }

}
