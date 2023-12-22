import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        long[] a = new long[n];
        long[] b = new long[n];
        
        long sum = 0;
        for(int i = 0; i<n; i++)
        {
            a[i] = sc.nextLong();
            sum += a[i];
            b[i] = sc.nextLong();
        }
        int maxIndex = 0;
        for(int i = 0; i<n; i++)
        {
            if(b[i]>b[maxIndex]){
                maxIndex = i;
            }
        }

        if(sum-n <= b[maxIndex])
            System.out.println("Yes");
        else
            System.out.println("No");
        
        
    }
}

