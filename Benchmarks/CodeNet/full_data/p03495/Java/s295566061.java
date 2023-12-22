import java.util.*;

public class Main {

    static int N;
    static int K;
    static int[] A;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println( solve() );
    }

    private static long solve() {
        Arrays.sort(A);

        Map<Integer, Integer> map = new HashMap<>(N);
        for (int i = 0; i < N; i++) {
            Integer count = map.get(A[i]);
            if( count != null ) {
                map.put(A[i], count+1);
            } else {
                map.put(A[i], 1);
            }
        }

        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(map.entrySet());
        Comparator<Map.Entry<Integer, Integer>> c = Comparator.comparingInt(Map.Entry::getValue);
        entries.sort(c);

        int rem_k = entries.size() - K;
        if( rem_k < 0 ) return 0;

        long ans = 0;
        for (int i = 0; i < rem_k; i++) {
            ans += entries.get(i).getValue();
        }
        return ans;
    }
}
