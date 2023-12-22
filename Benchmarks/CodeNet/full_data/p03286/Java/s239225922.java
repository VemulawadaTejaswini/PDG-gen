import java.util.*;

/**
 * Created by Santa.
 */
public class Main {

    static long N;
    static int M;
    static int A;
    static long B;
    static long C;
//    static int[][] map;
    static int min = 9999999;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextLong();
        int i = 1;
        if(N < 0){
            i = 0;
            N *= -1;
        }
        boolean ok = false;
        while(true){
            if(ok)break;
            System.out.println(N + " = " + i);
            if(i > 40)break;

            if(N >> i == 0)break;
            if(((N >> i) % 2) == 1){
                N += (long)1 << (i + 1);
            }
            i += 2;
        }


        System.out.println(Long.toBinaryString(N));

    }




}

