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
        int x=sc.nextInt();
        int y=sc.nextInt();
        int sum=0;

        if (x==3 ) sum+=100000;
        else if (x == 2) sum+=200000;
        else if (x == 1) sum+=300000;

        if (y==3 ) sum+=100000;
        else if (y == 2) sum+=200000;
        else if (y == 1) sum+=300000;

        if (x == 1 && y == 1) sum+=400000;

        System.out.println(sum);
        sc.close();
    }