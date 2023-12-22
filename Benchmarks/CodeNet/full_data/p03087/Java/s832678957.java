import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();
        String s = sc.next();

        for (int i = 0; i < q; i++) {
            int l = sc.nextInt() - 1;
            int r = sc.nextInt();
            String str = s.substring(l, r);
            String tmp = str.replace("AC", "");
            System.out.println((str.length() - tmp.length()) / 2);

        }
        sc.close();

    }
}