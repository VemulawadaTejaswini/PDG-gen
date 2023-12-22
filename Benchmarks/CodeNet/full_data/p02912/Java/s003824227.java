import java.util.*;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "YES";
    private static final String NO = "NO";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];
        for (int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println(solve(N, M, A));

    }

    private static long solve(int N, int M, int[] A) {
        long count = 0;
        //LinkedList list = new LinkedList<Integer>();
        List list = new ArrayList<Integer>();

        for (int i=0; i<N; i++) {
            count += A[i];
            list.add(A[i]);
        }
        Collections.sort(list);

        for (int i=0; i<M; i++) {
            int top = (int)list.remove(N-1);
            //int top = (int)list.pollLast();
            // int top = (int)list.remove(N-1);
            // System.err.println(top);

            count -= top - top/2;
            insert(list, top/2);
        }

        return count;
    }

    private static <T extends Comparable<? super T>>void insert(List<T> list, T element){
        int idx = Collections.binarySearch(list, element);
        // System.err.println("element=" + element + ", idx="+ idx);

        if(idx < 0){
            idx = -idx -1;
        }
        if (idx >= list.size()) {
            idx = list.size();
        }

        list.add(idx, element);
    }
}