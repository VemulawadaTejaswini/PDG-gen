import javax.print.DocFlavor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class Main {

    //グローバル変数を定義

    public static void main(String[] args) throws IOException {
        new Main().run();
    }

    void run() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        ArrayList array = new ArrayList();

        array.add(a);

        int count = 1;

        while(true) {

            if (a % 2 == 0) {
                a = a / 2;
            } else {
                a = 3 * a + 1;
            }

            count++;

            if (array.contains(a)) {
                System.out.println(count);
                break;
            }

            array.add(a);

        }
    }
}
