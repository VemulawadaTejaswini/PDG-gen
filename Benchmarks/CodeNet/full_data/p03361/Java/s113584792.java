import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Santa on 2016/10/16.
 */
public class Main {

    static int N;
    static long A;
    static long B;
    static long C;
    static String[] map;



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();
        A = scanner.nextInt();

        map = new String[N];
        for (int i = 0; i < N; i++) {
            map[i] = scanner.next();
        }

        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};


        int ans = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < A; j++) {
                if(map[i].charAt(j) == '#'){
                    boolean ok = false;
                    for (int k = 0; k < 4; k++) {

                        if(i + dy[k] < 0 || i + dy[k] >= N || j + dx[k] < 0 || j + dx[k] >= A)continue;
                        if(map[i + dy[k]].charAt(j + dx[k]) == '#')ok = true;
                    }
                    if(ok == false)ans = 1;
                }
            }
        }

        if(ans == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }



    }

}

