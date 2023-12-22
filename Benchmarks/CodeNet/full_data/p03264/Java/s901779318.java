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
        int k = sc.nextInt();
        int count = 0;

        for(int i=1; i<=k; i+=2){
            for(int j=2; j<=k; j+=2){
                count++;
            }
        }

        System.out.println(count);
    }
}
