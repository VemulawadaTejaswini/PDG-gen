import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];
        int[] h = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            h[i] = sc.nextInt();
        }
        int Cx = -1;
        int Cy = -1;
        int H = -1;
        loop: for (int i = 0; i <= 100; i++) {
            for (int j = 0; j <= 100; j++) {
                Set<Integer> set = new HashSet<>();
                for (int j2 = 0; j2 < N; j2++) {
                    int preH = Math.abs(x[j2] - i) + Math.abs(y[j2] - j) + h[j2];
                    set.add(preH);
                }
                if (set.size() == 1) {
                    Cx = i;
                    Cy = j;
                    for (int integer : set) {
                        H = integer;
                    }
                    break loop;
                }
            }
        }
        System.out.println(Cx + " " + Cy + " " + H);
        sc.close();
    }
}