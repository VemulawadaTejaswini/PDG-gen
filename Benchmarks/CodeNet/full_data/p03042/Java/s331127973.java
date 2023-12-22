import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        int left = Integer.parseInt(s.substring(0, 2));
        int right = Integer.parseInt(s.substring(2));

        String ans;
        if (isBetween1and12(left)) {
            if (isBetween1and12(right)) {
                ans = "AMBIGUOUS";
            } else {
                ans = "MMYY";
            }
        } else {
            if (isBetween1and12(right)) {
                ans = "YYMM";
            } else {
                ans = "NA";
            }
        }

        System.out.println(ans);
    }

    static boolean isBetween1and12(int i) {
        return 1 <= i && i <= 12;
    }
}
