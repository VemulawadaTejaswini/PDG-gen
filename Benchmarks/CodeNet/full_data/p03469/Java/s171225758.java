import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] ans = new char[10];
        for (int i = 0; i < 10; i++) {
            ans[i] = str.charAt(i);
            if (i == 3) {
                ans[i] = '8';
            }
            System.out.print(ans[i]);
        }
        System.out.println();
    }

}
