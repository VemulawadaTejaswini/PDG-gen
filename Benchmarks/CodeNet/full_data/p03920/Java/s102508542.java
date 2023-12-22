import java.util.*;

import static java.lang.String.format;

/**
 * Created by Seiya on 2016/10/16.
 */
public class Main {
    private final static int INF = 99999999;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int sum = 0;
        int i;
        for (i = 1; sum < N; i++) {
            sum += i;
        }
        int ans = sum - N;

        for (int j = 1; j < i; j++) {
            if(i != ans) System.out.println(j);
        }


    }
}


