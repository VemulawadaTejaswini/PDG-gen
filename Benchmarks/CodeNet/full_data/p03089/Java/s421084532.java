import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] count = new int[n];
        List<Integer> a = new ArrayList<>();
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (b[j] == i+1) {
                    if (a.size() >= i) {
                        a.add(i, i+1);
                        System.out.println(i+1);
                    } else {
                        System.out.println(-1);
                        return;
                    }
                }
            }
        }
    }
}
