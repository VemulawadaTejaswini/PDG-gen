import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        String t = sc.next();
        int min = s.length() + t.length();
        for (int i = 1; i <= t.length(); i++) {
            StringBuilder sb = new StringBuilder(s);
            String tsub = t.substring(i);
            sb.append(tsub);
            if (sb.toString().startsWith(s) && sb.toString().endsWith(t)) {
                min = s.length() + tsub.length();
            }
        }
        System.out.println(min);
    }

}
