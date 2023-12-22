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
    int a;
    int b;
    int c;
    long finalCount = Long.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        new Main().run();
    }

    void run() {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        int m = Math.max(Math.max(a, b), c);

        if(3*m % 2 == (a+b+c) % 2){
            System.out.println((3*m-(a+b+c))/2 + (3*m-(a+b+c))%2);
        } else {
            System.out.println((3*(m+1)-(a+b+c))/2 + (3*(m+1)-(a+b+c))%2);
        }
    }
}
