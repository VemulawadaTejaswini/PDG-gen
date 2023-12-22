import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long k = sc.nextInt();
        int count = 0;
        boolean[] array = new boolean[s.length()];
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) == s.charAt(i) && !array[i - 1]) {
                count++;
                array[i] = true;
            }
        }
        long ans = k * count;
        if (s.charAt(0) == s.charAt(s.length() - 1) && !array[s.length() - 1] && k > 1) {
            if (s.length() == 1) {
                ans = k / 2;
            } else {
                int recount = 1;
                array = new boolean[s.length()];
                array[0] = true;
                for (int i = 1; i < s.length(); i++) {
                    if (s.charAt(i - 1) == s.charAt(i) && !array[i - 1]) {
                        recount++;
                        array[i] = true;
                    }
                }
                ans /= 2;
                ans += recount * k / 2;
            }
        }
        System.out.println(ans);
    }
}