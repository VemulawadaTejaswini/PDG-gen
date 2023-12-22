import java.util.*;

public class Main {

    public static void main(String[] args) {
        //変数
        int count = 0;
        boolean sw = false;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int nmin = Integer.MAX_VALUE;

        int answer=0;

        //List<Integer> list1 = new ArrayList<>();
        //List<String> list2 = new ArrayList<>();
        //int array[] = new int[];
        Euclid e1=new Euclid();
        //入力
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[]=new int[N];
        for(int i=0;i<N;i++)
        {
            A[i]=sc.nextInt();
        }
        //処理
        int L[]=new int[N+1];
        for(int i=0;i<N+1;i++)
        {
            if(i==0)
            {
                L[i]=0;
            }else
            {
                L[i]=e1.gcd(L[i-1],A[i-1]);
            }
        }
        //System.out.println(Arrays.toString(L));

        int R[]=new int[N+1];
        int cc=N;
        for(int i=0;i<N+1;i++)
        {
            if(i==0)
            {
                R[N]=0;
            }else
            {
                //System.out.println(A[N-i]);
                R[N-i]=e1.gcd(R[cc],A[N-i]);
                cc--;
            }
        }
        //System.out.println(Arrays.toString(R));

        int a1;
        for(int i=0;i<N;i++)
        {
            a1=e1.gcd(L[i],R[i+1]);
            //System.out.println(i);
            if(max<a1)
            {
                max=a1;
            }
        }
        /*
        a1=e1.gcd(L[0],R[1]);
        a1=e1.gcd(L[1],R[2]);
        a1=e1.gcd(L[2],R[3]);
        a1=e1.gcd(L[3],R[4]);
         */
        answer=max;
        //Collections.sort(a);
        //System.out.println(Arrays.toString(list1.toArray()));
        //System.out.println(Arrays.toString(array1));
		//System.out.println(Arrays.deepToString(a));
        System.out.println(answer);
    }
}

class Euclid
{
    public static int gcd(int x,int y)//ユークリッドの互除法を使って2値の最大公約数を求める
    {
        int tmp;
        if(x<y)
        {
            tmp=x;
            x=y;
            y=tmp;
        }
        if(x==0)//(x or y)=0の時は0でない時の値を返す
        {
            return y;
        }else if(y==0)
        {
            return x;
        }else
        {
            while ((tmp = x % y) != 0)
            {
                x = y;
                y = tmp;
            }
            return y;
        }
    }
}