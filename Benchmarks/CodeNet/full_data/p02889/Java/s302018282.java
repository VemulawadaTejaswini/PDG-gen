import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        long L = scanner.nextLong();
        long dist[][] = new long[N][N];
        long graph[][] = new long[N][N];
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(i==j){
                    graph[i][j] = Long.valueOf(0);
                }else{
                    graph[i][j]= Long.MAX_VALUE/2;
                }
            }
        }
        for(int i=0; i<M; i++){
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            long C = scanner.nextLong();
            A--;
            B--;
            graph[A][B] = C;
            graph[B][A] = C;
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                for(int k=0; k<N; k++){
                    if(graph[j][k] > graph[j][i] + graph[i][k]){
                        graph[j][k] = graph[j][i] + graph[i][k];
                    }
                }
            }
        }
        int graph2[][] = new int[N][N];
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(i==j){
                    graph2[i][j] = 0;
                }else if(graph[i][j] <= L){
                    graph2[i][j] = 1;
                }else{
                    graph2[i][j] = Integer.MAX_VALUE / 2;
                }
            }
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                for(int k=0; k<N; k++){
                    if(graph2[j][k] > graph2[j][i] + graph2[i][k]){
                        graph2[j][k] = graph2[j][i] + graph2[i][k];
                    }
                }
            }
        }
        int Q = scanner.nextInt();
        for(int i=0; i<Q; i++){
            int from = scanner.nextInt()-1;
            int to = scanner.nextInt()-1;
            if(graph2[from][to] >= Integer.MAX_VALUE /2){
                System.out.println(-1);
            }else{
                System.out.println(graph2[from][to]-1);
            }
        }
    }
}