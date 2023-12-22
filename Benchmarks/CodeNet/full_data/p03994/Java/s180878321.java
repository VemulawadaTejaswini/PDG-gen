import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long k = sc.nextLong();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length() - 1; i++) {
            char c = s.charAt(i);
            if ('z' - c + 1 > k) {
                sb.append(c);
                continue;
            }
            sb.append('a');
            k -= 'z' - c + 1;
        }
        char c = s.charAt(s.length() - 1);
        sb.append((char) (((c + k - 'a') % 26) + 'a'));
        System.out.println(sb);
    }

}
