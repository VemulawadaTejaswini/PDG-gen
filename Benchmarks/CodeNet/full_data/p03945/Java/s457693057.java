import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s  = sc.next();
        int ans = 0;
        for (int i = 0 ; i < s.length() - 1 ; i++) {
            String b = s.substring(i, i + 1);
            String c = s.substring(i + 1, i + 2);
            if (!b.equals(c)) {
                ans++;
            }
        }
        System.out.println(ans);
    }

}