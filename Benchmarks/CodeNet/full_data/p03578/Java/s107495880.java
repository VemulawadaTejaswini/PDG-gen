import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] D = new int[N];
        for(int i = 0; i < N; i++)
            D[i] = sc.nextInt();
        int M = sc.nextInt();
        int[] T = new int[M];
        for(int i = 0; i < M; i++)
            T[i] = sc.nextInt();
        sc.close();

        Arrays.sort(D);
        Arrays.sort(T);

        int idx_D = 0;
        int idx_T = 0;
        while(idx_D < N){
            if(idx_T == M)
                break;
            if(D[idx_D] == T[idx_T]){
                idx_T++;
            }
            idx_D++;
        }
        if(idx_T == M)
            System.out.println("YES");
        else
            System.out.println("NO");
   }
}