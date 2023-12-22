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

        int M = scanner.nextInt();

        int l = 0;
        int r = 1000000;
        int mid;

        int ans = 1;

        for (int i = 1; i <= 100000; i++) {
            long nokori = M - (long)N * i;

            if(nokori >= 0 && nokori % i == 0)ans = i;


        }

        System.out.println(ans);



    }
}

