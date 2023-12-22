import java.util.*;

public class Main {
    public static String f(char[] s, int i, String ans, int sum) {
        if (i == 4 && sum == 7) return ans + "=7";
        else if (i == 4) return "";
        String ans1 = f(s, i + 1, ans + "-" + s[i], sum - Integer.parseInt(s[i] + ""));
        String ans2 = f(s, i + 1, ans + "+" + s[i], sum + Integer.parseInt(s[i] + ""));
        if (ans1.length() >= ans2.length()) return ans1;
        return ans2;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char s[] = scan.next().toCharArray();
        System.out.println(f(s, 1, s[0] + "", Integer.parseInt(s[0] + "")));
    }
}
