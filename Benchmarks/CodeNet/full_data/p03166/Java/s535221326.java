import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int Edge[][] = new int[N+1][N+1];
        int DP [] = new int[N];
        Arrays.fill(DP,0);
        for(int i=0;i<N+1;i++) Arrays.fill(Edge[i],0);
        int opt [] = new int[N];
        int opt_num = 0;
        Queue<Integer> L = new ArrayDeque<>();
        for(int i=0;i<M;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            Edge[x][y]=1;
        }
        //トポロジカルソート
        for(int i=1;i<N+1;i++){
            boolean check = true;
            for(int j=1;j<N+1;j++) {
                if (Edge[j][i] == 1) {
                    check = false;
                    break;
                }
            }
            if(check)L.add(i);
        }
        DP[0]=0;
        while(L.size()!=0) {
            int num = L.poll();
            opt[opt_num] = num;
            for(int i=0;i<opt_num;i++){
                if(Edge[opt[i]][num]==2){
                   DP[opt_num] = Math.max(DP[opt_num],DP[i]+1);
                }
            }
            opt_num++;
            for (int i = 1; i < N + 1; i++) {
                if (Edge[num][i] == 1){
                    Edge[num][i] = 2;
                    boolean check = true;
                    for (int j = 1; j < N + 1; j++) {
                        if (Edge[j][i] == 1) {
                            check = false;
                            break;
                        }
                    }
                    if (check) L.add(i);
                }
            }
        }
        System.out.println(DP[N-1]);
    }
}