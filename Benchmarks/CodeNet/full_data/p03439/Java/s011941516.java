import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());

        // 主処理
        int target = n - 1;
        System.out.println(target);
        String seat = sc.next();
        if (!"Vacant".equals(seat)) {

            for (int i = 0; i < 20; i++) {
                target /= 2;
                System.out.println(target);
                String seat2 = sc.next();

                if (!"Vacant".equals(seat2)) {
                    if (seat == seat2) {
                        target /= 2;
                    } else {
                        target += target / 2;
                    }
                    seat = seat2;

                } else {
                    break;
                }
            }
        }

        sc.close();
    }
}
