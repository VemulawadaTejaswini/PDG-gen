import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        int N =sc.nextInt();
        int M =sc.nextInt();
        int count=0;
        int K,A;
        int ans[] =new int[M];
        
        for(int i=0; i < N; i++){
            K =sc.nextInt();
            for(int j = 0; j < K; j++){
                A =sc.nextInt();
                ans[A-1] += 1;
            }
        }
        for(int i = 0; i < M; i++){
            if(ans[i] == N){
                count += 1;
            }
        }
        System.out.println(count);
    }
}