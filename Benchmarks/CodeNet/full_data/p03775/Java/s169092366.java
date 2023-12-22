import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = 0;
        for(int i = (int)Math.sqrt(n);i > 0 ; i--){
            if(n % i == 0){
                a = i;
                break;
            }
        }
        int cnt = 0;
        a = n / a;
        while(a > 0){
            a /= 10;
            cnt++;
        }
        System.out.println(cnt);
    }
}