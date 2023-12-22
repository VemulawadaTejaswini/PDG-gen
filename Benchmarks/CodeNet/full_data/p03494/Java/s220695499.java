import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int a = 3;
        int a = sc.nextInt();
        int[] b = new int[a];

        for (int i = 0; i < a; i++) {
            b[i] = sc.nextInt();
        }

        int cnt = 0;
        while (foobaa(b)) {
            cnt += 1;
        }

        System.out.println(cnt);

    }

    static boolean foobaa(int[] aaa) {

        for (int i = 0; i < aaa.length; i++) {
            if (aaa[i] % 2 == 0) {
                aaa[i] = aaa[i] / 2;
            } else {
                return false;
            }
        }
        return true;
    }
}
