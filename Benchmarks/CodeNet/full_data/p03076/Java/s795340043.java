import java.util.*;

public class Main {

    public static void main(String[] args)
    {
        //変数
        int count=0;
        boolean sw=false;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int answer=0;
        List<Integer> a=new ArrayList<>();
        int tmp=0;
        //入力
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int C=sc.nextInt();
        int D=sc.nextInt();
        int E=sc.nextInt();
        //処理
        a.add(10-A%10);
        a.add(10-B%10);
        a.add(10-C%10);
        a.add(10-D%10);
        a.add(10-E%10);
        for(int i=0;i<5;i++)
        {
            tmp=a.get(i);
            if(tmp==10)
            {
                a.set(i,0);
            }
        }
        for(int i=0;i<5;i++)
        {
            if(max<a.get(i))
            {
                max=a.get(i);
            }
        }
        //System.out.println(Arrays.toString(a.toArray()));
        A+=a.get(0);
        B+=a.get(1);
        C+=a.get(2);
        D+=a.get(3);
        E+=a.get(4);
        //System.out.println(max);
        answer=A+B+C+D+E-max;
        /*
        Collections.sort(a);
        System.out.println(Arrays.toString(a.toArray()));
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);
        System.out.println(E);
        */
        System.out.println(answer);
    }
}