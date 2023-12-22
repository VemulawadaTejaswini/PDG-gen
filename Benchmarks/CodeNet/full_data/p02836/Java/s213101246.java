import java.util.Scanner;

public class BC147_B {
    //Palindrome-philia
    //改变最少的字符来使得字符串变成回文
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(helper(s));
        sc.close();
    }

    static int helper(String s) {
        int lo = 0, hi = s.length() - 1;
        int count = 0;
        while (lo < hi) {
            if (s.charAt(lo) != s.charAt(hi)) count++;
            lo++;
            hi--;
        }
        return count;
    }
}
