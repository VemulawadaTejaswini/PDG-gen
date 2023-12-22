import java.util.*;

public class Main {
    
    static int[] L;
    static int[] R;
    static int[] p;
    static int[] q;
    static long[][] table;
    static int N;
    static int M;
    static int Q;
    
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        N = sc.nextInt();
        M = sc.nextInt();
        Q = sc.nextInt();
        
        L = new int[M];
        R = new int[M];
        p = new int[Q];
        q = new int[Q];
        table = new long[N+1][N+1];
        
        for(int i = 0; i < M; i++){
            L[i] = sc.nextInt();
            R[i] = sc.nextInt();
        }
        
        for(int i = 0; i < Q; i++){
            p[i] = sc.nextInt();
            q[i] = sc.nextInt();
        }
        
        buildTable();
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < Q; i++){
            sb.append( getSum(p[i], q[i]) ).append("\r\n");
        }
        System.out.println( sb.toString() );
        
    }
    
    static void buildTable(){
        
        for(int i = 0; i < M; i++){
            table[R[i]][L[i]]++;
        }
        
        for(int i = 0; i <= N; i++){
            for(int j = 0; j <= N; j++){
                if( j > 1 ) table[i][j] += table[i][j-1];
                if( i > 1 ) table[i][j] += table[i-1][j];
                if( i > 1 && j > 1 ) table[i][j] -= table[i-1][j-1];
            }
        }
        
    }
    
    static long getSum(int L, int R){
        return table[R][R] - table[R][L-1] - table[L-1][R] + table[L-1][L-1];
    }
}
