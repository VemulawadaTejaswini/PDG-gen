import java.util.*;

public class Main {

    public static void main(String[] args) {
        //Compute c1 = new Compute();//calc

        long count = 0;
        boolean sw = false;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double dMax = Double.MIN_VALUE;
        double dMin = Double.MAX_VALUE;
        //StringBuilder answer=new StringBuilder();

        //input
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        long h[] = new long[n];
        for (int i=0;i<n;++i) h[i]=sc.nextLong();

        String ans[]={"Yes","No"};
        int ansInd=0;

        for (int i=1;i<n-1;++i)
        {
            long h1=h[i-1];
            long h2=h[i];
            long h3=h[i+1];

            if (h2>=h1 && h2<=h3) continue;

            if (h2<h1 || h2>h3)
            {
                long hh=h2-1;
                if (hh>=h1 && hh<=h3)
                {
                    h[i]=hh;
                } else
                {
                    ansInd=1;
                    break;
                }
            }
        }
        System.out.println(ans[ansInd]);
        //output
        //System.out.println(String.format("%.0f",answer));
    }
}