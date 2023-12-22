import java.util.*;

public class Main {
    public static void main(String args[]) {
       //値の取得
       Scanner sc = new Scanner(System.in);
       int time[] = new int[5]; //料理提供にかかる時間を料理ごとに格納する配列
       for (int i = 0; i < 5; ++i){
           time[i] = sc.nextInt();
       }

       int order[] = new int[5]; //注文する順番に格納する配列
      
       //注文した料理をorderに格納し、時刻を10の倍数に修正した後、次の料理を注文
       for (int i = 0; i < 5; ++i){
           if(time[i] % 10 == 0) {
               order[i] = (time[i] / 10) * 10;
           } else {
               order[i] = (time[i] / 10) * 10 + 10;
           }
       }
       
       int total = 0;   //総時間
       for(int i = 0; i < 5; ++i) {
           total += order[i];    //料理提供にかかった時間を総時間に加算
       }
       
       //出力
       System.out.println(total);
    }
}