import java.util.*;

public class Main{
    public static void main(String[] args){
        Sccaner sc = new Scanner(System.in);
        long N  = sc.nextLong();
        double limit = Math.sqrt(N);
        long min = N;
        for(int i = 0; i < limit; i++){
            if(N % i != 0) continue;
            long j = N/i;
            min = Math.min(i, j);
        }
        System.out.println(min);
    }
}