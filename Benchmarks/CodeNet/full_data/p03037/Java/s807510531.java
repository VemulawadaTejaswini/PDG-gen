import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] gate = new int[N]; 
        for(int i = 0; i < N; i++) gate[i] = 0;
        
        int left = 0;
        int right = N;
        for(int i = 0; i < M; i++){
            int L = sc.nextInt();
            int R = sc.nextInt();
            
            if(left <= L) left = L;
            if(R <= right) right = R;
            for(int j = left - 1; j < right; j++) gate[j]++;
        }
        
        int ans = 0;
        for(int i = 0; i < N; i++){
            if(gate[i] == M)ans++;
        }
        System.out.println(ans);
    }
}