import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        if (d == 0) {
            if (n == 100) {
                System.out.println(101);
            } else {
                System.out.println(n);
            }
        } else if (d == 1) {
            if (n == 100) {
                System.out.println(100);
            } else {
                sb.append(String.valueOf(n));
                sb.append("00");
                System.out.println(sb.toString());
            }
        } else {
            if (n == 100) {
                System.out.println(10000);
            } else {
                sb.append(String.valueOf(n));
                sb.append("0000");
                System.out.println(sb.toString());
            }
        }
    }
}