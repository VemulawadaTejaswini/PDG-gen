import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int nValue = Integer.parseInt(n);
        String[] v = new String[nValue];

        Map<String, Integer> mapVg =new HashMap<String, Integer>();  // 偶数
        Map<String, Integer> mapVk =new HashMap<String, Integer>(); // 奇数
        for (int i = 0; i < nValue; i++) {
            v[i] = sc.next();
            if (i%2 ==1) {
                // 奇数のカウント
                if (mapVk.get(v[i]) == null) {
                    // mapになければ1を設定
                    mapVk.put(v[i], 1);
                } else {
                    // mapにあれば１追加した値を設定
                    mapVk.put(v[i], mapVk.get(v[i])+1);
                };
            } else {
                // 偶数のカウント
                if (mapVg.get(v[i]) == null) {
                    // mapになければ1を設定
                    mapVg.put(v[i], 1);
                } else {
                    // mapにあれば１追加した値を設定
                    mapVg.put(v[i], mapVg.get(v[i])+1);
                };
            }
        }


        // kgkgkgk…にするイメージ
        // k・・・偶数列にする文字列
        String k = "";
        Integer maxSyuruiK=0;
        for (Map.Entry<String, Integer> entry:mapVk.entrySet()) {
            if ( entry.getValue() > maxSyuruiK) {
                k=entry.getKey();
                maxSyuruiK=entry.getValue();
            }
        }
        String g = ""; // g・・・偶数列にする文字列
        Integer maxSyuruiG=0; // maxSyuruiG･･･一番多い数字がいくつあるかのカウント
        for (Map.Entry<String, Integer> entry:mapVg.entrySet()) {
            if ( entry.getValue() > maxSyuruiG) {
                // 奇数と偶数が同じ値でない場合のみ設定する（全部同じ値の場合の考慮）
                /*if (!k.equals(entry.getKey())) {
                    g=entry.getKey();
                    maxSyuruiG=entry.getValue();
                }*/
            	/*上の考慮は除外して計算*/
            	g=entry.getKey();
                maxSyuruiG=entry.getValue();
            }
        }

        int cnt=0;

        /* 判定 */
        /* 奇数と偶数で多数を占める文字が一致した場合 */
        if(k.equals(g)) {
        	/* 奇数側と偶数側でどちらが多いかを判断 */
        	if(maxSyuruiK>maxSyuruiG) {
        		cnt+=(nValue/2)-maxSyuruiK;
        		cnt+=maxSyuruiG;
        	}else {
        		cnt+=(nValue/2)-maxSyuruiG;
        		cnt+=maxSyuruiK;
        	}
        /* 奇数と偶数で多数の文字が不一致の場合 */
        }else {
        	cnt+=(nValue/2)-maxSyuruiK;
        	cnt+=(nValue/2)-maxSyuruiG;
        }

        /*
        for (int i = 0; i < nValue; i++) {
            if (i%2 ==0 && !v[i].equals(g)) {
                // 奇数でv[i]がkと異なる場合
                cnt++;
            }
            if (i%2 ==1 && !v[i].equals(k)) {
                // 偶数でv[i]がgと異なる場合
                cnt++;
            }
        }
        */

        System.out.println(cnt);
    }
}