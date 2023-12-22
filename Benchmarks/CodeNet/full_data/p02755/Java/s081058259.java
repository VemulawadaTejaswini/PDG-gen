import java.util.*;

public class Main {
	public static void main(final String[] args) {

        Scanner sc = new Scanner(System.in);

        // 8%時の税抜価格
        int a = (int)(sc.nextInt() / 0.08);

        // 10%時の税抜価格
        int b = (int)(sc.nextInt() / 0.1);

        // 税抜き価格 最小値判別
        if ((b <= a) && (a <= b + 9)) {

            System.out.println(a);
        } else if ((a <= b) && (b <= a + 12)) {

            System.out.println(b);
        } else {

            System.out.println("-1");
        }
    }
}