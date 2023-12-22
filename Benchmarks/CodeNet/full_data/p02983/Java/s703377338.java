import java.util.*;

public class Main {

    public static void main(String[] args) {
        //
        //Compute c1 = new Compute();//計算系
        //変数
        int count = 0;
        boolean sw = false;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double dMax = Double.MIN_VALUE;
        double dMin = Double.MAX_VALUE;
        int answer = 0;
        //String answer="No";
        //StringBuilder answer=new StringBuilder();
        //List<Integer> list = new ArrayList<>();
        //int array[] = new int[];

        //入力
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        List<Integer> list=new ArrayList<>();

        for (int i=l;i<r;++i)
        {
            for (int j=i+1;j<=r;++r)
            {
                int a=(i*j)%2019;
                if (a==0) { sw=true; break;}
                if (min>a) { min=a; }
            }
            if (sw==true) { break;}
        }
        answer=min;
        //出力
        //BigDecimal bd = new BigDecimal(answer);
        //System.out.println(bd.setScale(12,BigDecimal.ROUND_DOWN));
        //System.out.println(String.format("%.0f",answer));
        System.out.println(answer);
    }
}