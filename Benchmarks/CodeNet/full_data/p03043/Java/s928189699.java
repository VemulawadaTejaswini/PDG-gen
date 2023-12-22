import java.util.Scanner;
import java.math.BigDecimal;

public class Main{
    public static void main(String args[]){
        BigDecimal[] r = new BigDecimal[17];
        BigDecimal tmpr = BigDecimal.ONE;
        for(int i = 0; i < 17; i++){
            tmpr = tmpr.multiply(BigDecimal.valueOf(2L));
            r[i] = tmpr;
        }
        
        Scanner sc = new Scanner(System.in);
        BigDecimal N = BigDecimal.valueOf(sc.nextLong());
        BigDecimal K = BigDecimal.valueOf(sc.nextLong());
        BigDecimal result = BigDecimal.ZERO;
        
        int index = 0;
        //initialize
        while(true){
            if(r[index].compareTo(K) >= 0){
                break;
            }
            index++;
        }
        
        int k = K.intValue();
        int n = N.intValue();
        int cnt = 0;
        BigDecimal one = BigDecimal.ONE;
        
        for(int i = 1; (i < k && i <= n); i++){
            cnt++;
            BigDecimal a = new BigDecimal(i);
            if(index > 0 && (a.multiply(r[index - 1])).compareTo(K) >= 0){
                index--;
            }
            BigDecimal x = N.multiply(r[index]);
            result = result.add(one.divide(x, 12, BigDecimal.ROUND_HALF_UP));
        }
        cnt += 1;
        if(cnt <= n){
            for(int i = cnt; i <= n; i++){
                result = result.add(one.divide(N, 12, BigDecimal.ROUND_HALF_UP));
            }
        }
        
        System.out.println(result.toString());
    }
}
