import java.util.*;

class Main {

    static public int[] solve(int N, int[] A) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : A) {
            map.put(n, map.getOrDefault(n, 0)+1);
        }
        int sum = 0;
        for (int v : map.values()) {
            sum += v*(v-1)/2;
        }
        
        int[] res = new int[N];
        for (int i = 0; i < N; i++) {
            int cnt = map.get(A[i]);
            res[i] = cnt >= 2 ? (sum-cnt+1) : sum;   
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        sc.close();

        for (int n : solve(N, A))
            System.out.println(n);
    }
}