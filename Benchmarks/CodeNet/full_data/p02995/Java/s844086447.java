
import java.util.Scanner;

 class Main {

    public static long gcd(long a, long b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    public static long divisibleBy(long a, long b, long num){
        long from,to;
        if(a%num==0){
            from=a/num-1;
        }
        else
            from=a/num;

        to = b/num;
        return to-from;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a= in.nextLong();
        long b= in.nextLong();
        long c= in.nextLong();
        long d = in.nextLong();

        if(a>b){
            long temp=a;
            a=b;
            b=temp;
        }
        long lcm= (c*d)/gcd(c,d);
        long nums = b-a+1;
        long divisibleByC = divisibleBy(a,b,c);
        long divisibleByD = divisibleBy(a,b,d);
        long divisibleByLCM = divisibleBy(a,b,lcm);

        long ans= nums- (divisibleByC+divisibleByD-divisibleByLCM);
        System.out.println(ans);

    }
}
