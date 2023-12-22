import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int p = 0;
        long m = n + 1;
        boolean flag = false;
        int k = 0;
        long t = 0;
        for(int i = 1; i <= 16; i++){
            if((m % Math.pow(10, i) == 0)){
                flag = true;
                k = i;
                t = m / (int)Math.pow(10, i);
            }
        }
        if(flag) System.out.println(9 * k + t - 1);
        else{
            long x = 0;
            while(n > 0){
                n /= 10;
                p++;
                if(n < 9 && 0 < n) x = n;
            }
            System.out.println((p-1) * 9 + x-1);
        }
    }
}