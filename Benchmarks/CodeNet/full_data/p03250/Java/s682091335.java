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
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();

        int max = -1;

        int one = Integer.parseInt(a) + Integer.parseInt(b+c);
        int two = Integer.parseInt(a) + Integer.parseInt(c+b);
        int three = Integer.parseInt(b) + Integer.parseInt(a+c);
        int four = Integer.parseInt(b) + Integer.parseInt(c+a);
        int five = Integer.parseInt(c) + Integer.parseInt(a+b);
        int six = Integer.parseInt(c) + Integer.parseInt(b+a);

        max = Math.max(one, two);
        max = Math.max(max, three);
        max = Math.max(max, four);
        max = Math.max(max, five);
        max = Math.max(max, six);
        System.out.println(max);
    }
}
