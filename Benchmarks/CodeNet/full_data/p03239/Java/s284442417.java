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
        int t = sc.nextInt();

        int minCost = 10001;

        for(int i=0; i<n; i++){
            int cost = sc.nextInt();
            int time = sc.nextInt();

            if(time <= t){
                minCost = Math.min(minCost, cost);
            }
        }

        if(minCost == 10001) System.out.println("TLE");
        else System.out.println(minCost);
    }
}
