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
            sb.append(String.valueOf(n));
            for(int i=0; i<n; i++)  sb.append("00");
            System.out.println(sb.toString());
        } else {
            sb.append(String.valueOf(n));
            for(int i=0; i<n; i++)  sb.append("0000");
            System.out.println(sb.toString());
        }
    }
}