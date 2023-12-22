import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] sp = new String[n];

        for (int i = 0; i < n; i++) {
            String city = sc.next();
            int point = sc.nextInt();
            sp[i] = city + "_" + (1100 - point) + "_" + (i+1);
        }

        Arrays.sort(sp);
        for (String s: sp) {
            String ans = s.split("_")[2];
            System.out.println(ans);
        }
    }
}
