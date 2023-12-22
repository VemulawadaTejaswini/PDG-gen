import java.util.*;


/**
 * Created by santa on 2016/10/16.
 */

public class Main {

    static long A;
    static long B;
    static int N;

    static long[] map = new long[100006];
    static long[] map1 = new long[100006];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();
        map = new long[N];

        A = scanner.nextLong();
        B = scanner.nextLong();


        for (int i = 0; i < N; i++) {
            map[i] = scanner.nextLong();
        }
        Arrays.sort(map);
        long r = 1000000000;
        long l = 0;
        long mid = 0;
        for (int i = 0; i < 100; i++) {
            mid = (r + l + 1) / 2;
            if (cheak(mid)) {
                r = mid;
            } else {
                l = mid;
            }
        }

        System.out.println(r);


    }// mainMethod

    static boolean cheak(long k) {
        for (int i = 0; i < N; i++) {
            map1[i] = map[i];
        }

        for (int i = 0; i < N; i++) {
            map1[i] -= B * k;
        }
//        for (int i = 0; i < N; i++) {
//            System.out.println(map1[i]);
//        }
        long temp = A - B;
        for (int i = 0; i < N; i++) {
            long aa = (map1[i] + temp - 1) / temp;
            k -= aa;
            if (k < 0) return false;
        }

        //System.out.println("k = " + k);
        if(k < 0){
            return false;
        }else {
            return true;
        }

    }


} // MainClass
