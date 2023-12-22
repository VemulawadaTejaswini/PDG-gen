import java.util.*;
import java.text.*;

public class Main {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int len = String.valueOf(n).length();
    int[] arr = {3, 5, 7};
    int cnt = 0;

    public static void main(String[] args){
        new Main().run();
    }

    void run() {

        if (n<357) {
            System.out.println(0);
            return;
        }

        dfs("");

        System.out.println(cnt);
    }

    void dfs(String s) {
        if (3 <= s.length() && s.length() <= len) {
//            System.out.println(s);
            if (s.contains("3") && s.contains("5") && s.contains("7") && Integer.parseInt(s) <= n) cnt++;
            if (s.length() != len) {
                for (int i=0; i<arr.length; i++) dfs(s + arr[i]);
            };
        } else {
            for (int i=0; i<arr.length; i++) {
                dfs(s + arr[i]);
            }
        }
    }


}
