import java.util.*;
public class Main {
    static boolean[][] road;
    static int N;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int Q = sc.nextInt();
        int a[]=new int[N-1];
        int b[]=new int[N-1];
        int[] res = new int[N];
        road = new boolean[N+1][N+1];
        for(int i=0; i<N-1; i++){
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
            road[a[i]][b[i]] = true;
            res[i]=0;
        }
        
        int[] p = new int[Q];
        int[] x = new int[Q];
        for(int i=0; i<Q; i++){
            p[i]=sc.nextInt();
            x[i]=sc.nextInt();
        }

        for(int i=0; i<Q; i++){
            dfs(p[i],x[i],res);
        }

        String ans = String.valueOf(res[0]);
        for(int i=1; i<N; i++){
            ans = ans + " " + res[i];
        }
         System.out.println(ans);
        
        
        
        
        }

        static void dfs(int p, int x, int[] res){
            res[p-1] = res[p-1]+x;

            for(int i=p+1; i<N+1; i++){
                if(road[p][i]){
                    dfs(i,x,res);
                }
            }
        }
    }