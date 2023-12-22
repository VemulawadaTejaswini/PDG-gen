import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner s = new Scanner(System.in);
        
        int N = s.nextInt();
        int K = s.nextInt();
        BigDecimal res = new BigDecimal(0);
        BigDecimal a = new BigDecimal(1);
        BigDecimal b = new BigDecimal(N);
        BigDecimal d = a.divide(b, 1, BigDecimal.ROUND_HALF_UP);
        
        
        for(int i = 0;i < N;i++){
            if(K > i + 1){
                BigDecimal e = new BigDecimal(Math.pow(0.5 , Math.ceil(Math.log(K / (i + 1)) / Math.log(2))));
                res = res.add(d.multiply(e));
            }else{
                res = res.add(d);
            }
        }
        
        System.out.println(res);


    }
}
