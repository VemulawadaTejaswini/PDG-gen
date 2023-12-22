import javax.print.DocFlavor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.function.BiConsumer;

public class Main {

    //グローバル変数を定義

    public static void main(String[] args) throws IOException {
        new Main().run();
    }

    void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];

        for(int i=0; i<n; i++){
            array[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++){
            int sum = 0;
            int before = 0;
            for(int j=0; j<n; j++){
                if(i == j) continue;
                int now = array[j];
                sum += Math.abs(now - before);
                before = now;
            }
            sum += Math.abs(0 - before);
            System.out.println(sum);
        }
    }
}
