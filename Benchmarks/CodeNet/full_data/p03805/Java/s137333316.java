import java.util.*;

public class Main {

    static <T extends Comparable<? super T>> boolean nextPermutation(T[] sequence) {
        int first = getFirst(sequence);
        if (first == -1) return false;
        int toSwap = sequence.length - 1;
        while (sequence[first].compareTo(sequence[toSwap]) >= 0) --toSwap;
        swap(sequence, first++, toSwap);
        toSwap = sequence.length - 1;
        while (first < toSwap) swap(sequence, first++, toSwap--);
        return true;
    }

    static <T extends Comparable<? super T>> int getFirst(T[] sequence) {
        for (int i = sequence.length - 2; i >= 0; --i)
            if (sequence[i].compareTo(sequence[i + 1]) < 0) return i;
        return -1;
    }

    static <T extends Comparable<? super T>> void swap(T[] sequence, int i, int j) {
        T tmp = sequence[i];
        sequence[i] = sequence[j];
        sequence[j] = tmp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] matrix = new int[N][N];
        for (int i = 0; i < N; ++i) Arrays.fill(matrix[i], 0);
        for (int i = 0; i < M; ++i) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            matrix[a][b] = 1;
            matrix[b][a] = 1;
        }

        Integer[] arr = new Integer[N];
        for (int i = 0; i < N; ++i) arr[i] = i;

        int cnt = 0;
        do {
            if (arr[0] != 0) break;
            boolean flag = true;
            for (int i = 0; i < N-1; ++i) {
                if (matrix[arr[i]][arr[i+1]] == 0) flag = false;
            }
            if (flag) ++cnt;
        } while (nextPermutation(arr));

        System.out.println(cnt);
    }
}