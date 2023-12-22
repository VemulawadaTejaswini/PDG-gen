import javax.management.monitor.CounterMonitor;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        //
        //Euclid e1=new Euclid();//ユークリッドの互除法
        //Compute c1=new Compute();//累積和，
        //変数
        int count = 0;
        boolean sw = false;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        //int answer=0;
        String answer = "NA";
        //StringBuilder answer=new StringBuilder();
        //List<Integer> list = new ArrayList<>();
        //int array[] = new int[];

        //入力
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int s = Integer.parseInt(S);
        int ss = Integer.parseInt(S.substring(2, 3)) * 10 + Integer.parseInt(S.substring(3, 4));
        int sss = Integer.parseInt(S.substring(0, 1)) * 10 + Integer.parseInt(S.substring(1, 2));
        //System.err.println(sss);
        //System.err.println(ss);
        if (sss <= 12 && sss > 0 && ss <= 12 && ss > 0)
        {
            answer = "AMBIGUOUS";
        } else if (sss > 12 || sss==0)
        {
            if (ss <= 12 && ss>0)
            {
                answer = "YYMM";
            } else {
                answer = "NA";
            }
        }else if(sss<=12 && sss>0)
        {
            if(ss>0)
            {
                answer="MMYY";
            }else
            {
                answer="NA";
            }
        }else
        {
            answer="NA";
        }
        //出力
        //System.err.println();//標準エラー出力
        System.out.println(answer);
    }
}