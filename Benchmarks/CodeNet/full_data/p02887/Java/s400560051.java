import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        char[] ary = new char[n];
        String s = sc.next();
        ary = s.toCharArray();
        int ans = 1;
        for (int i = 0; i < n - 1; i++) {
            if (ary[i] != ary[i + 1]) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}