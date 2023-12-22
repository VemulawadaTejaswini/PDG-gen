import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        boolean [][] boo = new boolean[N][N];
        for(int i=0; i<M; i++){
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            boo[a][b] = boo[b][a] = true;
        }
        for(int i=0; i<N; i++){
            if(boo[0][i]&&boo[i][N-1]){
                System.out.println("POSSIBLE");
                System.exit(0);
            }
        }
        System.out.println("IMPOSSIBLE");
    }
}