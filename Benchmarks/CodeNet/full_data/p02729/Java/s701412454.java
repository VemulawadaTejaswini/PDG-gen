import java.util.*;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 

public class Main{

    static int comb(int m,int n)
    {
        int res=1;

        if(n>m-n)
            n=m-n;

        for(int i=0;i<n;i++)
        {
            res*=(m-i);
            res/=(i+1);
        }
        return res;
    }
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int m= in.nextInt();
        int n = in.nextInt();

        int total_ways=0;

        if(m>=2)
            total_ways+=comb(m,2);

        if(n>=2)
            total_ways+=comb(n,2);

        System.out.println(total_ways);
    }
}
