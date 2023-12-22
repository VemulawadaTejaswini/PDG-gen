import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        dfs("a");
    }

    void dfs(String s) {
        if (s.length() == n) {
            System.out.println(s);
        } else {
            if (s.charAt(s.length()-1) == 'a') {
                for (char c='a'; c<='b'; c++) {
                    dfs(s + c);
                }
            } else {
                char tmp = s.charAt(s.length()-1);
                char l = --tmp;
                char r = ++tmp;
                ++r;
//                System.out.println(r);
                for (char c=l; c<=r; c++) {
                    dfs(s + c);
                }
            }
        }
    }
}