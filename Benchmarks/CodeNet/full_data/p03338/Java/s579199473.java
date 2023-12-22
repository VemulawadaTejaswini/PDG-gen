import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int res = 0;
        for (int i = 0; i < n - 1; i++) {
            int counter = 0;
            String x = s.substring(0, i + 1);
            String y = s.substring(i + 1);
            boolean[] b1 = new boolean[26];
            boolean[] b2 = new boolean[26];
            for (int j = 0; j < x.length(); j++) {
                b1[x.charAt(j) - 97] = true;
            }
            for (int j = 0; j < y.length(); j++) {
                b2[y.charAt(j) - 97] = true;
            }
            for (int j = 0; j < 26; j++) {
                if (b1[j] && b2[j]) {
                    counter++;
                }
            }
            res = Math.max(res, counter);
        }
        System.out.println(res);
        sc.close();
    }
}