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
        int N = sc.nextInt();
        int M = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();

        int maxX = -111;
        int minY = 111;

        for(int i=0; i<N; i++){
            int eachX = sc.nextInt();
            if(eachX > maxX) maxX = eachX;
        }

        for(int i=0; i<M; i++){
            int eachY = sc.nextInt();
            if(eachY < minY) minY = eachY;
        }

        if(minY > maxX) {
            for(int i=maxX+1; i<=Y; i++){
                if(i > X){
                    System.out.println("No War");
                    break;
                } else {
                    System.out.println("War");
                    break;
                }
            }
        } else {
            System.out.println("War");
        }
    }
}
