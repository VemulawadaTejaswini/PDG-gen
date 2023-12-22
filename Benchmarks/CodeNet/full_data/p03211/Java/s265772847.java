import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n;
        int ans = 753;
        boolean flag = true;
        int i = 1;
        int kotae = 100000;
        int num = 0;
        while (flag) {
            int sa = m % 1000;
            if (Math.abs(ans - sa) < kotae) {
                kotae = Math.abs(ans - sa);
                num = sa;
            }
            m = m / 10;
            if (m < 10) {
                flag = false;
            }
        }
        System.out.println(Math.abs(ans - num));
    }
}