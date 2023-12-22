import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();

        long ans = f(A-1) ^ f(B);

        System.out.println(ans);
    }

    static long f(long ln){

        long val =0;
        for (int i = 1; i < 50; i++) {

            long cycle = 1L << i;

            long count = 0;
            count = ((ln +1 )/ cycle) * cycle/2;
            count +=Math.max(0,((ln +1) % cycle) - cycle/2);
            if(count%2 == 1){
                val += 1L <<(i-1);
            }
        }
        return val;
    }
}