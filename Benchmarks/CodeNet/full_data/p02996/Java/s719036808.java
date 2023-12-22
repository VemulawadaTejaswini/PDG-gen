import java.util.*;
public class Main {

    public static void main(String[] args)
    {
        int count=0;
        boolean sw=false;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        double dMax=Double.MIN_VALUE;
        double dMin=Double.MAX_VALUE;
        //int answer=0;
        String answer="Yes";
        //StringBuilder answer=new StringBuilder();

        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        ArrayList<Cost> costs=new ArrayList<>();

        for (int i=0;i<N;++i)
        {
            Cost p=new Cost(sc.nextInt(),sc.nextInt());
            costs.add(p);
        }

        costs.sort((p,q)->p.b-q.b);

        int time=0;
        for (Cost i:costs)
        {
            time+=i.a;
            if (time>i.b)
            {
                answer="No";
                break;
            }
        }

        //output
        //BigDecimal bd=new BigDecimal(answer);
        //System.out.println(bd.setScale(12,BigDecimal.ROUND_DOWN));
        //System.out.println(String.format("%.0f",answer));
        System.out.println(answer);
    }
}

class Cost
{
    int a;
    int b;

    public Cost(int x,int y)
    {
        a=x;
        b=y;
    }
}