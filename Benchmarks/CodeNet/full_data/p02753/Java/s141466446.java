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
        //
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        String s = sc.next();
        String s1 = s.substring(0,1);
        String s2 = s.substring(1,2);
        String s3 = s.substring(2,3);

        if (s1.equals(s2) && s2.equals(s3)) System.out.println("No");
        else System.out.println("Yes");
        sc.close();
    }
}