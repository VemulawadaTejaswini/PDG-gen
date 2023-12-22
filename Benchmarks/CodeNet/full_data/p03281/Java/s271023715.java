

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        int a = sc.nextInt();
        int ans = 0;
        int a357 = 105;
        int a3511 = 165;
        int a3513 = 195;
        if (a357 <= a) {
            ans++;
        }
        if (a3511 <= a) {
            ans++;
        }
        if (a3513 <= a) {
            ans++;
        }
        System.out.println(ans);
    }
}
