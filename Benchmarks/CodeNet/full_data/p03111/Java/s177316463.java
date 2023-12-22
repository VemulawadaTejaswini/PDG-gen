import java.util.Scanner;

public class Main {

    private static int[] banboo;
    private static int N;
    private static int A;
    private static int B;
    private static int C;

    private static int INF = 1000000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();
        A = scanner.nextInt();
        B = scanner.nextInt();
        C = scanner.nextInt();

        banboo = new int[N];

        for(int i=0; i<N; i++){
            banboo[i] = scanner.nextInt();
        }

        System.out.println(dfs(0, 0, 0, 0));

    }

    private static int dfs(int depth, int a, int b, int c){

        if(depth == N){
            if(a==0 || b==0 || c ==0){
                return INF;
            }else{
                return Math.abs(A - a) + Math.abs(B - b) + Math.abs(C - c) - 30;
            }
        }

        int ret0 = dfs(depth+1, a, b, c);
        int ret1 = dfs(depth+1, a + banboo[depth], b, c) + 10;
        int ret2 = dfs(depth+1, a , b+ banboo[depth], c) + 10;
        int ret3 = dfs(depth+1, a , b, c+ banboo[depth]) + 10;

        return Math.min(Math.min(ret0, ret1), Math.min(ret2, ret3));

    }


}
