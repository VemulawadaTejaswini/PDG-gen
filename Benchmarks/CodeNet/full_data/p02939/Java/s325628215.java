import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        int cnt = 1;
        String prev = String.valueOf(s.charAt(0));
        StringBuilder sb  = new StringBuilder();
        for(int i = 1; i < s.length();i++) {
            sb.append(String.valueOf(s.charAt(i)));
            if (!prev.equals(sb.toString())) {
                cnt++;
                prev = sb.toString();
                sb.delete(0, sb.length());
            }
        }
        System.out.println(cnt);
    }
}