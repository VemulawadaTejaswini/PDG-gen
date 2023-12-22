import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int val1 = sc.nextInt();

        int count = 99999;
        for (int i = 1; i <= val1; i++) {
            for (int n = 1; n <= val1; n++) {
                int sum = i * n;
                if (sum == val1) {
                    String a = "" + i;
                    String b = "" + n;
                    int val = Math.max(a.length(), b.length());
                    if (count > val) {
                        count = val;
                    }
                }
            }
        }
        System.out.println(count);
    }
}