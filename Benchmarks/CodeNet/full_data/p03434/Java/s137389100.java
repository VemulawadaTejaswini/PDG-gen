import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Santa on 2016/10/16.
 */
public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] map = new int[100];
        int[] ans = new int[2];

        for (int i = 0; i < N; i++) {
            map[i] = scanner.nextInt();
        }

        Arrays.sort(map);

        for (int i = 0; i < 100; i++) {
            ans[i % 2] += map[i];
        }

        System.out.println(ans[1] - ans[0]);
    }



}


