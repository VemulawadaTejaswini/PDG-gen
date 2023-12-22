

import java.io.*;
import java.util.*;

/**
 * Bounding
 */
public class Main {

    public static void main(String[] args) {
        
        // 標準入力から2行読み取り
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input1 = null;
        String input2 = null;
        try {
            input1 = br.readLine();
            input2 = br.readLine();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 入力されたデータを使用できる形に加工
        int n = Integer.parseInt(input1.split(" ")[0]);   int x = Integer.parseInt(input1.split(" ")[1]);
        List<Integer> boundDistance = new ArrayList();
        for(String s : input2.split(" ")){
            boundDistance.add(Integer.parseInt(s));
        }

        /* n+1回のバウンドで、跳ねた時の座標がx以下である回数をカウントする。 */
        int boundPoint, countUnderX;
        boundPoint = 0;
        countUnderX = 0;
        for(int i = 0; i <= n; i++){
            if(boundPoint <= x) countUnderX++;
            if(i != n) boundPoint += boundDistance.get(i);
        }

        // 結果の出力
        System.out.println(countUnderX);
    }
}