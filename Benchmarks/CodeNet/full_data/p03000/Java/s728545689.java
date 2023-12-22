
import javafx.scene.transform.Scale;

import java.util.Scanner;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-06-16
 **/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int[] L = new int[n];
        for(int i=0; i<n; i++){
            L[i] = scanner.nextInt();
        }
        int res = solve(L, n, x);
        System.out.println(res);
    }

    private static int solve(int[] l, int n, int x) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += l[i];
            count++;
            if(sum>x) break;
        }
        return count;
    }

}
