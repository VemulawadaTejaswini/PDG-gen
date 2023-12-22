import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                list.add(i);
            }

            int a = 0;
            int[] W = new int[N];
            int w = 0;

            for (int i = 0; i < M; i++) {
                int p = sc.nextInt() - 1;
                String s = sc.next();

                if (s.equals("AC")) {
                    if (list.contains(p)) {
                        a++;
                        w += W[p];
                        list.remove(Integer.valueOf(p));
                    }
                } else if (s.equals("WA")) {
                    W[p]++;
                }
            }

            System.out.println(a + " " + w);
        }
    }

}
