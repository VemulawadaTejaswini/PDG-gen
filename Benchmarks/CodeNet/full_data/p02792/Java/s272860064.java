import java.util.Scanner;

/**
 * TITLE : Handstand 2
 * URL : https://atcoder.jp/contests/abc152/tasks/abc152_d
 */
public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int count = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (Integer.parseInt(String.valueOf(i).substring(0, 1)) == j % 10
                        && Integer.parseInt(String.valueOf(j).substring(0, 1)) == i % 10) {
                    count++;
                }
            }
        }
        System.out.println(count);
        sc.close();
    }
}