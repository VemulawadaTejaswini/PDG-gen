import java.util.*;

/*
ボールが N個あり、 i番目のボールには整数 
Aiが書かれています。
k=1,2,...,N
 に対して以下の問題を解いて、答えをそれぞれ出力してください。

k 番目のボールを除いた 
N−1 個のボールから、書かれている整数が等しいような異なる 
2 つのボールを選び出す方法の数を求めてください。選ぶ順序は考慮しません。
*/



public class Main {
    public static void main(final String[] args){
        //スキャン
        final Scanner s = new Scanner(System.in);
        int N = Integer.parseInt(s.next());
        final int[] As = new int[N];
        for(int i = 0;i<=N-1;i++){
            As[i] = s.nextInt();
        }
        //kを全て網羅するまで
        for(int k = 0;k<=N-1;k++){
            //組み合わせ数
            int ansCounter = 0;
            //配列内の番号の種類の記録簿
            List<Integer> list = new ArrayList<Integer>();
            //全数列を調査
            for(int i = 0;i <= N-1;i++){
                //番号選出
                //As[i]

                //番号登録済みかチェック
                if(!list.contains(As[i])){
                    //登録されてないなら、記録簿に登録
                    list.add(As[i]);
                    //重複数確認
                    int doubled = checker(As,As[i]);
                     //除いた値と一緒だったら、-1
                    if(As[i] == As[k]){
                        doubled--;
                    }
                    //組み合わせ数を計算
                    int addNum = doubled*(doubled-1)/2;;
                    ansCounter += addNum;
                }
              
            }
            System.out.println(ansCounter);
            //出力したら初期化
            ansCounter = 0;
            list.clear();
        }

    }

    /**
     * 同一数字カウンター
     * @param Array 対象配列
     * @param target 検索数字
     * @return 同一数
     */
    private static int checker(final int[] Array,final int target){
        int counter =0;
        for(int i2=0; i2 <=Array.length-1;i2++){
            if(Array[i2] == target){
                counter++;
            }
        }
        return counter;
    }
}
