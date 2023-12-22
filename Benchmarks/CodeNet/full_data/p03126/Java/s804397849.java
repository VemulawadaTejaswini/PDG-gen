import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K[] = new int[N];
        int A[][] = new int[N][M];
        int ans[] = new int[M];
        int count = 0;
        for(int i = 0; i < N-1; i++){
            K[i] = sc.nextInt();
            for(int j =0; j < M-1; j++){
                A[i][j] = sc.nextInt();
                ans[j+1] = A[i][j]; 
            }
        }
        for(int i = 0; i < M-1; i++){
            if(ans[i] == N){
                count += 1;
            }
        }
        System.out.println(count);
    }
}