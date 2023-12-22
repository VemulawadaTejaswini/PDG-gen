import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String s;
        long k;

        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        k = sc.nextLong();

        int change = 0;
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
                if (continueCount > 0) {
                    change += continueCount / 2;
                    continueCount = 1;
                }
                check = s.charAt(j);
            }
        }
        if (continueCount > 0) {
            change += continueCount / 2;
        }
        long ans = change * k;
        System.out.println(ans);
    }
}