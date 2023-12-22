import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] v = new int[N];
        for (int i = 0; i < N; i++) {
            v[i] = sc.nextInt();
        }
        System.out.println(solve(v,K,N));
    }

    static  int solve(int[] v, int K,int N){

        int max = 0;
        for (int L = 0; L < K  ; L++) {
            for (int R = 0; R < K-L  ; R++) {
                if( L+R > N) break;
                int d = K- (L+R);
                int sum = 0;
                List<Integer> list = new ArrayList<>();
                for (int i = 0; i < R; i++) {
                    list.add(v[i]);
                    sum += v[i];
                }
                for (int i = N-1 ; i >= N-L; i--) {
                    list.add(v[i]);
                    sum += v[i];
                }
                Collections.sort(list);
                for (int i = 0; i < Math.min(list.size(),d); i++) {
                    int num = list.get(i);
                    if(num>=0) break;
                    sum -= num;
                }
                max = Math.max(max,sum);
            }
        }
        return max;

    }
}