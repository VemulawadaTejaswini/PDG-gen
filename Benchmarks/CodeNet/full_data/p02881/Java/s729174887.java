import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long min = Long.MAX_VALUE;
        for(long i =  2; i < Math.sqrt(N); i++){
            if(N % i == 0){
                long n = N / i;
                min = Math.min(min, (n-1)+ (i - 1));
            }
        }
        if(min > N){
            min = N -1;
        }
        System.out.println(min);
    }
}
