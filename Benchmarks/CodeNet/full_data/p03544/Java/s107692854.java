import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(luca(sc.nextLong()));
    }
    static long luca(long n){
        if(n==0) return 2;
        if(n==1) return 1;
        return luca(n-1) + luca(n-2);
    }
}