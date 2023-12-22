import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        char[] c = sc.next().toCharArray();
        sc.close();

        int ans = 0;

        for (int i = 1; i < c.length; i++) {
            if (c[i - 1] == c[i]) {
                if (c[i] == '1') {
                    c[i] = '0';
                } else {
                    c[i] = '1';
                }
                ans++;
            }
        }

        System.out.println(ans);
    }

}