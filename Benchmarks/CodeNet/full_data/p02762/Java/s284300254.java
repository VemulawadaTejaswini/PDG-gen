import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        int [][] FL = new int[N+1][N+1];
        int [][] DP = new int[N+1][N+1];
        for(int i=0;i<N+1;i++){
            Arrays.fill(FL[i],0);
            Arrays.fill(DP[i],0);
        }
        for(int i=0;i<M;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            FL[a][b]=1;
            FL[b][a]=1;
        }
        for(int i=0;i<K;i++) {
            int c = sc.nextInt();
            int d = sc.nextInt();
            FL[c][d] = -1;
            FL[d][c] = -1;
        }
        for(int i=1;i<=N;i++){
            ArrayList<Integer> L =new ArrayList<>();
            int [] check = new int[N+1];
            Arrays.fill(check,0);
            check[i]=1;
            DFS(i,i,check,FL,L,N);
            if(i!=N)System.out.print(L.size()+" ");
            else System.out.println(L.size());
        }
    }
    public static void DFS(int source,int now,int [] check,int [][] FL,ArrayList<Integer> L,int N){
        for(int i=1;i<N+1;i++){
            if(FL[now][i]==1&&check[i]==0) {
                check[i] = 1;
                DFS(source,i, check, FL, L, N);
            }
        }
        if(FL[source][now]==0&&source!=now){
            L.add(now);
        }
    }
}