import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    public static void main (String[] args) {
        new Main().run();
    }

    void run() {
        dfs("", 'a');
    }

    void dfs(String s, char c) {
        if (s.length()==n) {
            System.out.println(s);
        } else {
            for (char ch='a'; ch<=c; ch++) {
                dfs(s+ch, (char)(ch+1));
//                dfs(s+c, (ch==c) ? (char)(c+1) : ch);
            }
        }
    }

}