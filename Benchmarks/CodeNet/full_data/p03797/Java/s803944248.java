import java.util.*;

/**
 * Created by Seiya on 2016/10/16.
 */

public class Main {

    static final long MOD = 1000000007;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long N = scanner.nextInt();
        long M = scanner.nextInt();

        long temp = Math.min(N, M / 2);

        if(temp == N){
            long a = M - 2 * N;
            temp += a / 4;
        }

        System.out.println(temp);

    } // mainMethod



} // MainClass
