import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int lB = 0;
        int rA = 0;
        int lrBA = 0;

        int ans = 0;
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            boolean isLeftB = false;
            boolean isRightA = false;
            if (s.charAt(0) == 'B')
                isLeftB = true;
            if (s.charAt(s.length()-1) == 'A')
                isRightA = true;

            if (isLeftB && isRightA)
                lrBA++;
            else if (isLeftB)
                lB++;
            else if (isRightA)
                rA++;

            for (int j = 0; j < s.length(); j++) {
                if (s.indexOf("AB", j) >= 0) {
                    ans++;
                    j = s.indexOf("AB", j);
                } else {
                    break;
                }
            }
        }

        ans += lrBA + Math.min(lB, rA);
        if (lB == 0 && rA == 0)
            ans--;

        System.out.println(ans);
    }
}