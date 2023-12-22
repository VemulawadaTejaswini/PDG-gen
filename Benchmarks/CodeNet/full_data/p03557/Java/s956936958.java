import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        int[] C = new int[N];
        for(int i = 0;i < N;i++)    A[i] = sc.nextInt();
        for(int i = 0;i < N;i++)    B[i] = sc.nextInt();
        for(int i = 0;i < N;i++)    C[i] = sc.nextInt();
        Arrays.sort(A);
        Arrays.sort(B);
        Arrays.sort(C);
        int[] BC = new int[N];
        int[] AB = new int[N];
        int cid = N-1;
        for(int i = N-1;i >= 0;i++){
            while(B[i] < C[cid]) cid--;
            if(i == N-1)    BC[i] = N-1-cid;
            else    BC[i] = N-1-cid+BC[i+1];
        }
        int bid = N-1;
        for(int i = N-1;i >= 0;i++){
            while(A[i] < B[bid])    bid--;
            if(i == N-1){
                if(A[i] >= B[i])    AB[i] = 0;
                else    AB[i] = BC[bid+1];
            }else{
                AB[i] = BC[bid+1]+AB[i+1];
            }
        }
        System.out.println(AB[0]);
    }
}