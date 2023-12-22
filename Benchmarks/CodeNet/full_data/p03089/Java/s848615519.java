import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> b = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            b.add(sc.nextInt() - 1);
        }

        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int pivot = -1;
            for (int j = b.size() - 1; j >= 0; j--) {
                if (b.get(j) == j) {
                    pivot = j;
                    break;
                }
            }
            if (pivot == -1) {
                System.out.println(-1);
                return;
            }
            ans.add(pivot + 1);
            b.remove(pivot);
        }
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(ans.get(i));
        }
    }
}
