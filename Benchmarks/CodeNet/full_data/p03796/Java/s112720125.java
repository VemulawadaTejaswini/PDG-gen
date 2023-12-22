import java.util.*;
class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        long N = sc.nextLong();

        long res = fact(N);

        System.out.println(res);
    }

    public static long fact(long N){
        if(N==1) return 1;
        else {
            long r = (N * fact(N-1)) % ((long)Math.pow(10,9)+7);
            return r ;
        }
    }
}