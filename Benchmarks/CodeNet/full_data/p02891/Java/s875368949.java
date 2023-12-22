import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String s;
        long k;

        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        k = sc.nextLong();

        long change = 0;
        int continueCount = 1;
        char check = ' ';
        for (int i = 0; i <= s.length(); i++) {
            int j = i;
            if (i == s.length()) {
                j = 0;
            }
            if (s.charAt(j) == check) {
                continueCount++;
            } else {
                if (continueCount > 0)
                    change += continueCount / 2;
                continueCount = 1;
            }
            check = s.charAt(j);
        }

        boolean bellows = false;
        boolean endian = false;
        boolean single = false;
        if (continueCount > 0 && continueCount == s.length() + 1 && continueCount % 2 == 0) {
            change += continueCount / 2;
            bellows = true;
        } else if (continueCount > 0 && continueCount % 2 == 1) {
            change += continueCount / 2;
        } else if (continueCount > 0 && s.length() == 1) {
            change += continueCount / 2;
            single = true;
        } else if (continueCount > 0) {
            change += continueCount / 2;
            endian = true;
        }

        long ans = change * k;
        if (single) {
            ans /= 2;
        } else if (endian) {
            ans--;
        } else if (bellows) {
            ans -= k / 2;
            if (k % 2 == 1) ans--;
        }
        System.out.println(ans);
    }
}