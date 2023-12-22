
import java.util.Scanner;

public class Main {

    // https://atcoder.jp/contests/abc158/submissions/10588295
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        if (S.equals("AAA") || S.equals("BBB")){
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}