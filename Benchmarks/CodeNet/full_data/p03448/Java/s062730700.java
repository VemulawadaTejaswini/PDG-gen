import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int gohyakuen = Integer.parseInt(sc.nextLine());
        int hyakuen = Integer.parseInt(sc.nextLine());
        int gojuen = Integer.parseInt(sc.nextLine());
        int x = Integer.parseInt(sc.nextLine());
        sc.close();
        for (int i = 0; i <= gohyakuen; i++) {
            if (i * 500 > x) {
                continue;
            }
            for (int j = 0; j <= hyakuen; j++) {
                if (i * 500 + j * 100 > x) {
                    continue;
                }
                for (int k = 0; k <= gojuen; k++) {
                    if (i * 500 + j * 100 + k * 50 == x) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
