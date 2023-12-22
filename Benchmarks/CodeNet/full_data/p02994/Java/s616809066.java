import java.io.*;
import java.util.*;

public class Main {
    public static void main(String... args) {
        List<Apple> apples = new ArrayList();
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

        String[] input = null;
        // 標準入力読み込み
        try {
            input = br.readLine().split(" ");
            br.close();
        } catch (IOException e){
            e.printStackTrace();
        }
        int n = Integer.parseInt(input[0]);
        int l = Integer.parseInt(input[1]);

        // applesリストの作成
        for(int i = 0; i < n; i++){
            apples.add(new Apple(l + i));
        }

        // tasteの絶対値を基準に、applesを昇順でソート
        apples.sort((a1, a2) -> {
            int t1 = a1.taste;
            int t2 = a2.taste;
            int t1Abs = t1 >= 0 ? t1 : t1 * -1;
            int t2Abs = t2 >= 0 ? t2 : t2 * -1;
            if(t1Abs < t2Abs){
                return -1;
            } else if(t1Abs > t2Abs){
                return 1;
            } else {
                if(t1 < 0) return -1;
                else if(t2 < 0) return 1;
                else return 0;
            }
        });

        // 合計値の計算
        Integer totalTaste = 0;
        apples.remove(0);
        for (Apple a : apples) {
            totalTaste += a.taste;
        }
        System.out.println(totalTaste);
    }
}

class Apple {
    int taste;
    Apple(String taste){
        this.taste = Integer.parseInt(taste);
    }
    Apple(int taste){
        this.taste = taste;
    }
    @Override
    public String toString() {
        return ((Integer)this.taste).toString();
    }
}