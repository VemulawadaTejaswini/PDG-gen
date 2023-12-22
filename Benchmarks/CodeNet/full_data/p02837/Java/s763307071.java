import java.util.*;

class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = 0;
        int A[] = new int[N];
        int x[][] = new int[N][N];
        int y[][] = new int[N][N];
        for (int i=0;i<N;i++) {
            A[i] = sc.nextInt();
            for(int j=0;j<A[i];j++){
                x[i][j] = sc.nextInt();
                y[i][j] = sc.nextInt();
            }
        }
        //ここまで入力

        //bit全探索
        for(int bits=1; bits < (1 << N); bits++){
            boolean flag = true;
            for(int i=0; i<N; i++){
                //不親切な人の証言は考慮しない
                if((bits & (1 << i)) == 0) continue;
                for(int j=0; j<A[i]; j++){
                    if((((bits >> x[i][j]-1) & 1) ^ y[i][j]) == 1) flag = false;
                }
            }
            if(flag == true) ans = Math.max(ans, counter(bits));
        }
        System.out.println(ans);
    }

        //正直者の数を数えるメソッド
        public static int counter(int x){
            if(x == 0) return 0;
            return counter(x >> 1) + (x & 1);
        }
}