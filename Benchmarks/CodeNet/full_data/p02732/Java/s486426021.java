import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        Map<Integer, Integer> mMap = new HashMap<Integer, Integer>(N);
        long allsum = 0;
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            if (mMap.containsKey(A[i])) {
                allsum += mMap.get(A[i]);
                mMap.put(A[i], mMap.get(A[i])+1);
            }
            else {
                mMap.put(A[i], 1);
            }
        }
        sc.close();

        for (int i = 0; i < N; i++) {
            int num = mMap.get(A[i]);
            System.out.println(allsum - (num - 1));
        }
    }
}
