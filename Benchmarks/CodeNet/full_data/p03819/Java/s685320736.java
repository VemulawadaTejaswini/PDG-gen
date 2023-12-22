import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] strArray = line.split(" ");
        int N = Integer.valueOf(strArray[0]);
        int M = Integer.valueOf(strArray[1]);
        int[][] bentoMatrix = new int[N][M+1];
        int[][] teishaMatrix = new int[M][M+1];
        int[] result = new int[M];
        //弁当の販売範囲のマトリックスを設定
        for(int i=0;i<N;i++){
            line = br.readLine();
            strArray = line.split(" ");
            int a = Integer.valueOf(strArray[0]);
            int b = Integer.valueOf(strArray[1]);
            for(int j=a;j<=b;j++){
                bentoMatrix[i][j] = 1;
            }
        }
        //停車駅のマトリックスを設定
        for(int i=0;i<M;i++){
            for(int j=0;j<M+1;j++){
                if(j%(i+1) == 0){teishaMatrix[i][j] = 1;}
            }
        }
        //各電車の弁当購入可能数判定
        int[] tmp = new int[N];
        for(int i=0;i<M;i++){ //iは電車
            Arrays.fill(tmp,0);
            for(int j=0;j<M+1;j++){ //jは駅
                if(teishaMatrix[i][j] == 1){ //停車する場合
                    for(int k=0;k<N;k++){ //j駅で買える弁当を判定してフラグを立てる
                        if(bentoMatrix[k][j] == 1){
                            tmp[k] = 1;
                        }
                    }
                }
            }
            //各カウント結果を入れる
            for(int t:tmp){
                if(t==1)result[i]++;
            }
        }
        //結果出力
        for(int r:result){
            System.out.println(r);
        }
    }
}