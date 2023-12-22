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

        int[] map = new int[3];

        map[0] = scanner.nextInt();
        map[1] = scanner.nextInt();
        map[2] = scanner.nextInt();

        Arrays.sort(map);

        System.out.println(map[2] * 10 + map[1] + map[0]);

    }
}

