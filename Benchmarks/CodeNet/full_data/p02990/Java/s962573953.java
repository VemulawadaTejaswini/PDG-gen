import java.util.Scanner;

public class Main {

    static long[][] C;

    static long DIV = 1000000000 + 7;

    private static void initC(){
        C = new long[4002][4002];

        C[0][0] = 1;

        for(int i=0; i<4001; i++){
            for(int j=0; j<=i; j++){
                C[i+1][j] += C[i][j];
                C[i+1][j] %= DIV;
                C[i+1][j+1] += C[i][j];
                C[i+1][j+1] %= DIV;
            }
        }
    }

    private static long comb(int a, int b){
        if(a==b){
            return 1;
        }else if(a < b){
            return 0;
        }
        return C[a][b];
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        initC();

        int N = scanner.nextInt();
        int K = scanner.nextInt();

        for(int i=1; i<=K; i++){
            long ans = comb(K-1, i-1) * comb(N-K+1, i);
            ans %= DIV;

            System.out.println(ans);
        }

    }

}
