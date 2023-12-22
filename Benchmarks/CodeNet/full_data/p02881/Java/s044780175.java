import java.util.HashMap;
import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Long N = sc.nextLong();
        sc.close();

        HashMap<Long, Long> mul = new HashMap<Long, Long>();         
        for(int i = 1; i < N+1; i++){
            if((N % i) == 0){
                long j = N / i;
                mul.put((long) i, j);
            }
        }

        Long min = N;
        for (HashMap.Entry<Long, Long> entry : mul.entrySet()) {
            if(min > entry.getKey() +entry.getValue()){
                min = entry.getKey() +entry.getValue();
            }           
        }
        System.out.println(min-2);

    }
}