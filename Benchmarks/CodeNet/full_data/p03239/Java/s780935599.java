import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by Santa.
 */
public class Main {

    static int N;
    static int K;
    static int Q;
    static int A;
    static long B;
    static long C;
    //    static int[][] map;
    static int min = 9999999;
    static long ans = 0;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int T = scanner.nextInt();

        int min = 99999999;

        for (int i = 0; i < N; i++) {
            int c = scanner.nextInt();
            int tt = scanner.nextInt();

            if(tt <= T){
                min = Math.min(min, c);
            }
        }

        if(min == 99999999){
            System.out.println("TLE");
        }else{
            System.out.println(min);
        }


    }
}

