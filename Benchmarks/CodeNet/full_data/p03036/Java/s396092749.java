import java.util.*;
import java.lang.*;

public class Main {

    static long gcd(long a, long b){
        if(a<b) return gcd(b,a);
        if(b==0) return a;
        if(a%b==0) return b;
        return gcd(b,a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long r = sc.nextLong();
        long D = sc.nextLong();
        long weight = sc.nextLong();
        for(int i=0; i<10; i++){
            weight = r*weight-D;
            System.out.println(weight);
        }

    }
}