import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt(), W = sc.nextInt();
        int[] w = new int[N];
        long[] v = new long[N];
        for(int i=0;i<N;i++){
            w[i] = sc.nextInt();
            v[i] = sc.nextLong();
        }
        long[][] maxValue = new long[N][W+1];   //N行目はNを入れるか入れないか、W列目は重さWまでの時の最大値
        for(int j=0;j<W+1;j++){
            maxValue[0][j] = j >= w[0] ? v[0] : 0;
        }
        for(int i=1;i<N;i++){
            for(int j=0;j<W+1;j++){
                if(j >= w[i]){
                    maxValue[i][j] = Math.max(maxValue[i-1][j], maxValue[i-1][j-w[i]] + v[i]);  //入れられる重さなら入れてみる
                }else{
                    maxValue[i][j] = maxValue[i-1][j];      //入れられない
                }
            }
        }
        System.out.println(maxValue[N-1][W]);

    }
}
