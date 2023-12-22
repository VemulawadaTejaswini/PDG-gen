import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int s = sc.nextInt();

        int count = 0;
        for (int x = 0; x <= k; x++) {
            if (x > s) continue;
            for (int y = 0; y <= k; y++) {
                if (y > s) continue;
                for (int z = 0; z <= k; z++) {
                    if (z > s) continue;
                    if (x + y + z == s) count++;
                }
            }
        }

        System.out.println(count);
    }
}
