import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        long sum = 0;
        
        for(int a = 1; a <= k; a++)
        {
            for(int b = 1; b <= k; b++)
            {
                for(int c = 1; c <= k; c++)
                {
                    if(a == b && b ==c)
                    {
                        sum += a;
                    }
                    else
                    {
                        //最大公約数を求める
                        int buf = gcd(a,b,c);
                        sum += buf;
                    }
                }
            }
        }
        System.out.println(sum);
    }
    
    public static int gcd(int x,int y, int z) {
        if(x < y)
        {
            int buf = x;
            x = y;
            y = buf;
        }
        int r = 0;
        while(( r = x % y) != 0)
        {
            x = y;
            y = r;
        }
        
        if(y < z)
        {
            int buf = y;
            y = z;
            z = buf;
        }
        while((r = y % z) != 0)
        {
            y = z;
            z = r;
        }
        return z;
    }
}
