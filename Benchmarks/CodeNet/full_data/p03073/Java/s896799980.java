import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strs = sc.next().split("");
        String before = "0";
        int cnt0 = count(strs, "0");
        int cnt1 = count(strs, "1");

        if (cnt0 > cnt1) {
            System.out.println(cnt1);
        } else {
            System.out.println(cnt0);
        }

    }

    private static int count(String[] strs, String before) {
        int cnt = 0;
        for (String str : strs) {
            if (before.equals(str)) {
                cnt++;
                if (str.equals("0")) {
                    before = "1";
                } else {
                    before = "0";
                }
            } else {
                before = str;
            }
        }
        return cnt;
    }
}
