import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {

    //グローバル変数を定義

    public static void main(String[] args) throws IOException {
        new Main().run();
    }

    void run() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int[] array = new int[3];

        array[0] = a;
        array[1] = b;
        array[2] = c;

        Arrays.sort(array);

        int cost = 0;
        for(int i=0; i<array.length-1; i++){
            int before = array[i];
            int newCost = Math.abs(before - array[i+1]);
            cost+=newCost;
        }

        System.out.println(cost);
    }
}
