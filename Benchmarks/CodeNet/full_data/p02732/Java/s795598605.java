import java.util.Map.Entry;
import java.util.*;

import org.w3c.dom.css.Counter;

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
        int N = s.nextInt();
        HashMap<Integer,Long> counter = new HashMap<>();
        List<Integer> list = new ArrayList<Integer>();
        final int[] As = new int[N];

        for(int i = 0;i<=N-1;i++){
            As[i] = s.nextInt();
            if(!counter.containsKey(As[i])){
                //重複数を数え始める
                counter.put(As[i], (long) 1);
            }else{
                counter.put(As[i],counter.get(As[i])+1);
            }
        }
        s.close();
        
        //全組み合わせ計算
        Long allnum =0L;
        for(Entry<Integer,Long> entry :counter.entrySet()){
            Long param = entry.getValue();
            allnum += param*(param-1)/2;
        }
        //ｋの選択パターンを網羅
        for(int k = 0;k<=N-1;k++){
            //選ばれたkと同じ値は減衰させる
            if(counter.containsKey(As[k])){
                System.out.println(allnum - counter.get(As[k])+1);
            }else{
            System.out.println(allnum);
            }
        }
    }
}
