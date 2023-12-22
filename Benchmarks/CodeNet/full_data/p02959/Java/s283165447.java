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
        int n=sc.nextInt();
        int a[]=new int[n+1];
        int b[]=new int[n];
        for (int i=0;i<n+1;++i) a[i]=sc.nextInt();
        for (int i=0;i<n;++i) b[i]=sc.nextInt();

        for (int i=0;i<n;++i)
        {
            if (a[i]>=b[i])
            {
                count+=b[i];
//                a[i]-=b[i];
//                b[i]=0;
            }else
            {
                count+=a[i];
                b[i]-=a[i];
                if (a[i+1]>=b[i])
                {
                    count+=b[i];
                    a[i+1]-=b[i];
                }else
                {
                    count+=a[i+1];
                    a[i+1]=0;
                }
            }
        }
        System.out.println(count);
        //output
        //System.out.println(String.format("%.0f",answer));
    }
}