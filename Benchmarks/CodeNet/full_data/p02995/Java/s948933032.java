import java.util.*;

public class Main {

    public static void main(String[] args) {
        //
        //Euclid e1=new Euclid();//ユークリッドの互除法
        Compute c1=new Compute();//累積和，
        //変数
        int count = 0;
        boolean sw = false;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double dMax = Double.MIN_VALUE;
        double dMin = Double.MAX_VALUE;
        //int answer = 0;
        long answer=0;
        //String answer="Good";
        //StringBuilder answer=new StringBuilder();
        //List<Integer> list = new ArrayList<>();
        //int array[] = new int[];

        //入力
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        long D = sc.nextLong();

        long n = B-A+1;

        if(C==D)
        {
            long a=A/C;
            long b=B/C;
            long x=b-a;
            if (A%C==0) {x++;}
            answer=n-x;
            System.out.println(answer);
            return;
        }

        long c = Math.min(C, D);
        long d = Math.max(C, D);

        long a=A/c;
        long b=B/c;
        long p=b-a;
        if (A%c==0){p++;}

        a=A/d;
        b=B/d;
        long q=b-a;
        if (A%d==0){q++;}

        long e=c1.leastCommonMultiple(c,d);
        a=A/e;
        b=B/e;
        long r=b-a;
        if(A%e==0){r++;}

        answer=n-(p+q-r);
        //出力
        //BigDecimal bd = new BigDecimal(answer);
        //System.out.println(bd.setScale(12,BigDecimal.ROUND_DOWN));
        //System.out.println(String.format("%.0f",answer));
        System.out.println(answer);
    }
}

class Compute
{
    int cumulativeSum(int A[],int k)//kの大きさごとに配列Aを切り取ってその区間内の数を足した時の最大値をreturn
    {
        int ans=0;
        //累積和表を作成
        int B[]=new int[A.length+1];//累積和に使う配列
        B[0]=0;
        for(int i=1;i<B.length;i++)
        {
            B[i]=B[i-1]+A[i-1];
        }

        //最大値を求める
        int tmp=0;
        ans=B[k]-B[0];
        for(int i=1;i<A.length-k;i++)
        {
            tmp=B[i+k]-B[i];
            if(tmp>ans)
            {
                ans=tmp;
            }
        }
        System.out.println(Arrays.toString(B));
        return ans;
    }

    public int leastCommonMultiple(int a,int b)//最大公倍数
    {
        int ans=1;

        Map<Integer,Integer> aMap=new HashMap<>();
        Map<Integer,Integer> bMap=new HashMap<>();
        Map<Integer,Integer> map=new HashMap<>();


        for (int i=2;i<=a;i++)
        {
            if (a%i==0)
            {
                a/=i;

                if (aMap.get(i)==null) { aMap.put(i,1); }
                else
                {
                    int value=aMap.get(i);
                    aMap.put(i,value++);
                }
                i=1;
            }
        }

        for (int i=2;i<=b;i++)
        {
            if (b%i==0)
            {
                b/=i;

                if (bMap.get(i)==null)
                { bMap.put(i,1); }
                else
                {
                    int value=bMap.get(i);
                    value++;
                    bMap.put(i,value);
                }
                i=1;
            }
        }

        for (int i:aMap.keySet()) { map.put(i,aMap.get(i)); }

        for (int i:bMap.keySet())
        {
            if (map.get(i)==null) { map.put(i,bMap.get(i)); }
            else { if (map.get(i) < bMap.get(i)) { map.put(i,bMap.get(i)); } }
        }

        for (int i:map.keySet()) { ans*=Math.pow((double)i,(double)map.get(i)); }

        return ans;
    }

    public long leastCommonMultiple(long a,long b)//最大公倍数
    {
        long ans=1;

        Map<Integer,Long> aMap=new HashMap<>();
        Map<Integer,Long> bMap=new HashMap<>();
        Map<Integer,Long> map=new HashMap<>();


        for (int i=2;i<=a;i++)
        {
            if (a%i==0)
            {
                a/=i;

                if (aMap.get(i)==null) { aMap.put(i,(long)1); }
                else
                {
                    long value=aMap.get(i);
                    aMap.put(i,value++);
                }
                i=1;
            }
        }

        for (int i=2;i<=b;i++)
        {
            if (b%i==0)
            {
                b/=i;

                if (bMap.get(i)==null)
                { bMap.put(i,(long)1); }
                else
                {
                    long value=bMap.get(i);
                    value++;
                    bMap.put(i,value);
                }
                i=1;
            }
        }

        for (int i:aMap.keySet()) { map.put(i,aMap.get(i)); }

        for (int i:bMap.keySet())
        {
            if (map.get(i)==null) { map.put(i,bMap.get(i)); }
            else { if (map.get(i) < bMap.get(i)) { map.put(i,bMap.get(i)); } }
        }

        for (int i:map.keySet()) { ans*=Math.pow((double)i,(double)map.get(i)); }

        return ans;
    }
}