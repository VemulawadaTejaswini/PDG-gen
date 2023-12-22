import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean flg = true;
        ArrayList<Integer> points = new ArrayList<Integer>();
        Long[] Hs = new Long[N+1];
        for (int i = 1; i <= N; i++) {
            long H = sc.nextLong();
            Hs[i] = H;
            if (Hs[i - 1] > H) {
                Hs[i - 1] = Hs[i - 1] - 1;
                points.add(i - 1);
                for (Integer point : points) {
                    if (Hs[point] > H) {
                        flg = false;
                        break;
                    }
                }
            }
        }
        if (flg) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
