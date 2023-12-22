import java.util.*;

public class Main {

    public static void main(String[] args) {
        //Compute c1 = new Compute();//calc

        int count = 0;
        boolean sw = false;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double dMax = Double.MIN_VALUE;
        double dMin = Double.MAX_VALUE;
        //StringBuilder answer=new StringBuilder();

        //input
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        boolean flag=false;
        int ans=0;
        if (a%2!=b%2) System.out.println("IMPOSSIBLE");
        else 
        {
            for (int i=1;i<1000000000;++i)
            {
                if (Math.abs(a-i)==Math.abs(b-i))
                {
                    ans=i;
                    flag=true;
                    break;
                }
            }
            if (flag) System.out.println(ans);
            else System.out.println("IMPOSSIBLE");
        }
        //output
        //System.out.println(String.format("%.0f",answer));
    }
}