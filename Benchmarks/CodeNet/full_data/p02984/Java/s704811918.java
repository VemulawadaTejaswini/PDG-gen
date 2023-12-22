import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        long[] ans = new long[N];
        
        int p = 1;
        for(int i = 0; i < N; i++){
            ans[0] += A[i] * p;
            p *= -1;
        }
        
        for(int i = 1; i < N; i++){
            ans[i] += ans[i-1] * -1 + 2 * A[i-1];
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++){
            sb.append(ans[i]);
            if (i != N) sb.append(" ");
        }
        
        System.out.println(sb);
        
    }
}
