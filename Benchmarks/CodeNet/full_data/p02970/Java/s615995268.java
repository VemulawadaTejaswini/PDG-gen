import java.util.*;

public class Main {

    public static void main(String[] args) {
        //Compute c1 = new Compute();//計算系
        //変数
        int count = 0;
        boolean sw = false;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double dMax = Double.MIN_VALUE;
        double dMin = Double.MAX_VALUE;
        //int answer = 0;
        //String answer="No";
        //StringBuilder answer=new StringBuilder();

        //入力
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d=sc.nextInt();

        int dd=d*2+1;
        while (true)
        {
            ++count;
            if (dd*count>=n) break;
        }


        //出力
        //BigDecimal bd = new BigDecimal(answer);
        //System.out.println(bd.setScale(12,BigDecimal.ROUND_DOWN));
        //System.out.println(String.format("%.0f",answer));
        //System.out.println(answer);
        System.out.println(count);
    }
}