import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long l = 1;
        long prev = 0;
        for(int i = 0; i < n; i++){
            long temp = sc.nextLong()/2;
            l = lcm(l,temp);
            if(i == 0){
                prev = divide2(temp);
            }else{
                if(prev != divide2(temp)){
                    System.out.println(0);
                    return;
                }
            }
        }
        if(m < l){
            System.out.println(0);
        }else{
            if((m/l) % 2 == 0){
                System.out.println(m/(l*2));
            }else{
                System.out.println(1+m/(l*2));
            }
        }
        
    }

    private static long divide2(long l){
        long ret = 0;
        while(l % 2 == 0){
            ret++;
            l /= 2;
        }
        return ret;
    }
    
    private static long gcd(long a, long b)
    {
        while (b > 0)
        {
            long temp = b;
            b = a % b; // % is remainder
            a = temp;
        }
        return a;
    }
    
    private static long lcm(long a, long b)
    {
        return a * (b / gcd(a, b));
    }
}