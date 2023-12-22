import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char[] s = sc.next().toCharArray();
        int k = sc.nextInt();

        sc.close();

        for (int i = 0; i < s.length; i++) {
            if (s[i] != s[k - 1]) {
                s[i] = '*';
            }
        }

        System.out.println(new String(s));

    }

}