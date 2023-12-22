import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt(), p = 1, q = 1, r = 1;
        for(long i = 1; i <= 3500; i++)
            for(long j = 1; j <= 3500; j++)
                if(4 * i * j - n * i - n * j > 0)
                if(n * i * j % (4 * i * j - n * i - n * j) == 0){
                    p = i;
                    q = j;
                    r = n * i * j / (4 * i * j - n * i - n * j);
                    break;
                }
        System.out.println(p + " " + q + " " + r);
    }
}