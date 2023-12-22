import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> cs = new ArrayList<>();
        List<Integer> ss = new ArrayList<>();
        List<Integer> fs = new ArrayList<>();

        for (int i = 0; i < n - 1; i++) {
            int c = sc.nextInt();
            int s = sc.nextInt();
            int f = sc.nextInt();
            cs.add(c);
            ss.add(s);
            fs.add(f);
        }

        for (int i = 0; i < n - 1; i++) {
            int ans = 0;
            for (int j = i; j < n - 1; j++) {
                int mininum = ss.get(j);
                while (ans > mininum) {
                    mininum += fs.get(j);
//                    System.out.println(mininum);
                }
                ans = mininum;
                ans += cs.get(j);
//                System.out.println(ans);
            }
            System.out.println(ans);
        }
        System.out.println(0);
    }
}
