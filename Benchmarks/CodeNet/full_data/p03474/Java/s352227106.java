import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char[] s = sc.next().toCharArray();
        boolean flg = true;
        for (int i = 0 ; i < a + b + 1 ; i++) {
            if (i == a) {
                if (s[i] != '-') flg = false;
            } else {
                if (s[i] == '-') flg = false;
            }
        }
        System.out.println(flg ? "Yes" : "No");
    }

}