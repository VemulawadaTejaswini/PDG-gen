import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        long n = (long)number;
        BigInteger b = BigInteger.valueOf(n);
        BigInteger sum = BigInteger.ZERO;

        for(int i = 1; i <= number; i++){
            if(i%3 != 0 && i%5 != 0){
                sum = sum.add(BigInteger.valueOf((long)i));
            }
        }
        System.out.println(sum);

    }
}

