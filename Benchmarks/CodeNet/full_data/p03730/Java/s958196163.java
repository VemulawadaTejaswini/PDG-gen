import java.lang.reflect.Array;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        boolean[] flags = new boolean[b];
        boolean ans = false;
        for (int i = 0; ; i++) {
            int num = (a * i) % b;
            if (num == c) {
                ans = true;
                break;
            }
            if (flags[num])
                break;
            flags[num] = true;
        }
        if (ans)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
