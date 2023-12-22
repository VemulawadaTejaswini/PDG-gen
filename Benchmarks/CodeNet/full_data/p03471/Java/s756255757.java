import java.util.*;

import static java.lang.System.*;

// https://atcoder.jp/contests/abc085/tasks/abc085_c
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Y = sc.nextInt();

        solver(N, Y);
    }

    public static void solver(int N, int Y) {

        for(int x = 0; x < N; x++){
            for(int y = 0; y < N-x; y++){
                int z = N - x - y;
                if(10000 * x + 5000 * y + 1000 * z == Y){
                    out.println(x + " " + y + " " + z);
                    exit(1);
                }
            }
        }
        out.println("-1 -1 -1");
    }
}
