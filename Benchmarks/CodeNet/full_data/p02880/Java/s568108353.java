import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
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

        String ans[] = {"Yes","No"};

        int ansNum = 1;
        for (int i=1;i<10;++i)
        {
            for (int j = 1;j<10;++j)
            {
                if (i*j == n)
                {
                    ansNum = 0;
                }
            }
        }

        System.out.println(ans[ansNum]);

        sc.close();
    }
}