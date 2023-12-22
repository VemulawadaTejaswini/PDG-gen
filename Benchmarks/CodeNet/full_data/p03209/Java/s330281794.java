import java.util.Scanner;

public class Main{
    static long[] P = new long[50];
    static long[] B = new long[50];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long X = sc.nextLong();
        sc.close();
        // レベルiバーガーに含まれるパティの枚数
        P[0] = 1;
        // レベルiバーガーの層の総数
        B[0] = 1;
        for(int i = 1; i < 50; i++){
            P[i] = P[i - 1] * 2 + 1;
            B[i] = B[i - 1] * 2 + 3;
        }

        System.out.println(f(N, X));
    }

    // レベルNバーガーの下からX層に含まれるパティの枚数を返却する
    private static long f(int N, long X){
        if(N == 0){
            // レベル0バーガーの時
            if(X > 1){ return 1; } else { return 0;}
        } else if(X <= 1 + B[N-1]){
            // 食べる層数Xがバン＋レベルN-1バーガー以下の時
            return f(N-1, X-1);
        } else {
            // 食べる層数Xがバン＋レベルN-1バーガーより多い時（一つ目のレベルN-1バーガーを食べきってそれ以降のパティとレベルN-1バーガーを食べるとき）
            return P[N-1] + 1 + f(N-1, X-B[N-1]-2);
        }

    }
}