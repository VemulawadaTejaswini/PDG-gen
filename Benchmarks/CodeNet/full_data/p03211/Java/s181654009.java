import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // ターゲット
        final int target = 753;

        // 入力
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int diff = 999; // 3桁同士の差なので初期値は最大値999を設定

        // 検査
        for(int i=0; i<=s.length()-3; i++){
            int t = Integer.parseInt(s.substring(i, i + 3));

            int abs = Math.abs(target - t);
            diff = (diff > abs) ? abs : diff;
        }

        System.out.println(diff);
    }
}
