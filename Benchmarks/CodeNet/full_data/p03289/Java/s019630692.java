import java.util.*;
//https://atcoder.jp/contests/abc104/tasks/abc104_b
import java.util.regex.Pattern;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String S = sc.next();
        sc.close();
        final String R = "^A[a-z][a-z]*C[a-z]*[a-z]$";
        Pattern p = Pattern.compile(R);

        if (p.matcher(S).find())
            System.out.println("AC");
        else
            System.out.println("WA");
    }
}