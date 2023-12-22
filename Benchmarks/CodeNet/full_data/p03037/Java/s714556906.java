import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] gate = new int[N]; 
        for(int i = 0; i < N; i++) gate[i] = 0;
        
        for(int i = 0; i < M; i++){
            int L = sc.nextInt();
            int R = sc.nextInt();
            
            for(int j = L - 1; j < R; j++) gate[j]++;
        }
        
        int ans = 0;
        for(int i = 0; i < N; i++){
            if(gate[i] == M)ans++;
        }
        System.out.println(ans);
    }
}