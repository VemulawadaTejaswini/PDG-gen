import java.util.*;

public class Main {

    public static void main(String[] args) {
        //
        //Compute c1=new Compute();//計算系
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
        int n=sc.nextInt();
        int p[]=new int[n];

        for (int i=0;i<n;++i) { p[i]=sc.nextInt(); }

        for (int i=1;i<n-1;++i)
        {
            int a=Math.min(p[i-1],p[i+1]);
            int b=Math.max(p[i-1],p[i+1]);
            if(a<p[i] && b>p[i]){++count;}
        }
        answer=count;

        //出力
        //BigDecimal bd = new BigDecimal(answer);
        //System.out.println(bd.setScale(12,BigDecimal.ROUND_DOWN));
        //System.out.println(String.format("%.0f",answer));
        System.out.println(answer);
    }
}