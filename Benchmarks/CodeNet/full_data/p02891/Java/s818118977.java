import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Long k = Long.parseLong(sc.nextLine());

        long ans = solve(s, k);
        System.out.println(ans);
    }

    static long solve(String s, long k) {

        // 異なるが1つでもある場合
        List<Long> ranlength = new ArrayList<>();
        long ranl = 1;

        // 元文字列で何回置き換える必要があるか計算する
        for (int i = 1; i <= s.length(); i++) {
            if (i == s.length()) {
                ranlength.add(ranl);
                break;
            }

            if (s.charAt(i) == s.charAt(i - 1)) {
                ranl++;
            } else {
                ranlength.add(ranl);
                ranl = 1;
            }
        }

        long tmp = 0;
        for (int i = 0; i < ranlength.size(); i++) {
            tmp += ranlength.get(i) / 2;
        }

        return tmp * k;
    }
}
