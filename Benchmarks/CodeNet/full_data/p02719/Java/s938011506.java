import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int k = sc.nextInt();
        long sabu = 0;
        int cnt = 0;

        long min = Long.MAX_VALUE;

        while(true){
            long num  = Math.abs(n - k);
            
            if(n<num){//差の方が大きくなったら最初の数が最小
                min = n;
                break;
            }else if(sabu == n-num){//sabuが連続して同じなら0に収束するからカウントしてブレイク
                cnt++;
            }else if(sabu != n-num){//sabuが違う値を取ったらcnt初期化
                cnt = 0;
            }else if(num < min){//最小値の確保
                min = num;
            }else{
                break;
            }

            if(cnt == 3){
                min=0;
                break;
            }

            sabu = n-num;//sabuの更新
            n = num;//ｎの更新

        }

        System.out.println(min);
    }
}