import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        ArrayList<Long> items = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            items.add(scanner.nextLong());
        }
        ArrayList<Long> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > i; j--) {
                ans.add(items.get(i) * items.get(j));
            }
        }
        ans.sort((t1, t2) -> {
                    if (t1.equals(t2)) {
                        return 0;
                    } else if (t1 < t2) {
                        return -1;
                    } else {
                        return 1;
                    }
                }
        );

        System.out.println(ans.get(k - 1));
    }
}