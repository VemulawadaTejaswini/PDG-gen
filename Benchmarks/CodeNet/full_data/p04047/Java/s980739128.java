import java.util.*;

public class Main {

    public Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
	    new Main().solveA();
    }
    public int[] dx8 = { 1, 1,  1, 0,  0, -1, -1, -1 };
    public int[] dy8 = { 1, 0, -1, 1, -1,  1,  0, -1 };

    public void solveA() {
        int N = in.nextInt();
        int[] L = new int[2*N];
        for (int i = 0; i < 2 * N; i++)
            L[i] = in.nextInt();
        Arrays.sort(L);

        int res = 0;
        for (int i = 0; i < 2 * N; i += 2) res += L[i];

        System.out.println(res);
    }

    class Pair<T1 extends Comparable<T1>, T2 extends Comparable<T2>> implements Comparable<Pair<T1, T2>>{
        public T1 first;
        public T2 second;
        public Pair(T1 f, T2 s) {
            first = f;
            second = s;
        }

        @Override
        public int compareTo(Pair<T1, T2> o) {
            int res = first.compareTo(o.first);
            if (res != 0) return res;
            return second.compareTo(o.second);
        }
    }
}
