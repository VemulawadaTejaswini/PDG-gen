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
        String input = sc.next();
        String k = sc.next();

        if(k.equals("1")) {
            System.out.println(input.charAt(0));
            return;
        }

        for(int i=0; i<Long.parseLong(k); i++){
            if(input.charAt(i) == '1'){
                continue;
            } else {
                System.out.println(input.charAt(i));
                return;
            }
        }
        System.out.println("1");
    }
}
