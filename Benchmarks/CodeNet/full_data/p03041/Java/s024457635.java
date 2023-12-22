import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();
        sc.close();

        String ans = "";
        for (int i = 0; i < n; i++) {
            if (i == k - 1) {
                ans += String.valueOf(s.charAt(i)).toLowerCase();
            } else {
                ans += s.charAt(i);
            }
        }

        System.out.println(ans);
    }

}
