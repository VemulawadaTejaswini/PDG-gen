import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = 753;
        for (int i = 0; i < s.length() - 2; i++) {
            int num = Integer.parseInt(s.substring(i, i + 3));
            if (Math.abs(num - 753) < ans) {
                ans = Math.abs(num - 753);
            }
        }
        System.out.println(ans);
    }
}