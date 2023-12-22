import java.util.*;

class Pair implements Comparable {
    int left;
    int right;

    Pair(int left, int right) {
        this.left = left;
        this.right = right;
    }
    public int compareTo(Object o) {
        Pair other = (Pair) o;
        return this.right - other.right;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        Pair[] pairs = new Pair[M];
        for (int i = 0; i < M; i++) {
            int left = sc.nextInt() - 1;
            int right = sc.nextInt() - 1;
            pairs[i] = new Pair(left, right);
        }

        Arrays.sort(pairs);

        int lastBride = -1;
        int ret = 0;
        for (int i = 0; i < M; i++) {
            Pair pair = pairs[i];
            if (pair.left > lastBride) {
                ret++;
                lastBride = pair.right - 1;
            }
        }

        System.out.println(ret);
    }
}