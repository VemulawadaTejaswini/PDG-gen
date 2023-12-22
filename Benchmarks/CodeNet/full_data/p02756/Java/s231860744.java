import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int q = Integer.parseInt(sc.next());

        boolean isReverse = false;
        for (int i = 0; i < q; i++) {
            String query = sc.next();
            if ("2".equals(query)) {
                String func = sc.next();
                if (("1".equals(func) && !isReverse) || ("2".equals(func) && isReverse)) {
                    s = sc.next() + s;
                } else {
                    s += sc.next();
                }
            } else {
                isReverse = !isReverse;
            }
        }

        if (isReverse) {
            s = new StringBuffer(s).reverse().toString();
        }

        // 出力
        System.out.println(s);
        sc.close();
    }
}