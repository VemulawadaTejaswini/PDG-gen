import java.util.Scanner;


/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = 0, res = 0;
        int n = in.nextInt();
        char[] string = in.next().toCharArray();
        for (int i = 0; i < n; i++) {
            if (string[i] == 'I'){
                x++;
            }else {
                x--;
            }
            res = Math.max(res, x);
        }
        System.out.println(res);
    }
}
