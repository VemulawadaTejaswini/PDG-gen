import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        sc.close();

        long ans = 1;
        if (k > 12) {
            ans = 12;
            for (int i = 0; i < k - 12; i++) {
                long run = ans + 1;
                while (true) {
                    int len = String.valueOf(run).length();
                    long digit = (long) Math.pow(10, len - 1);
                    long column = run / digit;
                    boolean b = true;;
                    long r = run % digit;
                    for (int j = 1; j <= len; j++) {
                        if (digit > 0) {
                            if (Math.abs(column - r) > 1) {
                                b = false;
                                break;
                            }
                        } else {
                            if (Math.abs(column - r / digit) <= 1) {
                                column = r / digit;
                                r %= digit;
                                digit /= 10;
                            } else {
                                b = false;
                                break;
                            }
                            digit /= 10;
                        }
                    }
                    if (b) {
                        ans = run;
                        run++;
                        break;
                    }
                    run++;
                }
            }
        } else {
            ans = k;
        }
        System.out.println(ans);
    }
}
