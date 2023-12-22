import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        long k = sc.nextLong();
        for (int i = 0; i < s.length; i++) {
            if (s[i] == 'a' || 'z' - s[i] + 1 > k) {
                continue;
            }
            k -= 'z' - s[i] + 1;
            s[i] = 'a';
        }
        char c = s[s.length - 1];
        if (k > 0) {
            k %= 26;
            s[s.length - 1] = (char) (s[s.length - 1] + k);
        }
        System.out.println(new String(s));
    }

}
