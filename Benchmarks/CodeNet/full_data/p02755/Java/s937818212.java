
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double ana = a / 0.08;
        double anb = b / 0.1;
        if ((int)ana == (int)anb) {
            System.out.println((int)ana);
        } else {
            boolean f = false;
            int ak[] = new int[100];
            int bk[] = new int[100];
            for (int i = 0; i < 100; i++) {
                ak[i] = (int) ((a + 0.01 * i) / 0.08);
                bk[i] = (int) ((b + 0.01 * i) / 0.1);
            }
            int min=10000;
            for (int i = 0; i < 100; i++) {
                for (int j = 0; j < 100; j++) {
                    if (ak[i] == bk[j] && min > ak[i]) {
                        min = ak[i];
                        f =true;
                    }
                }
            }
            if (f) {
                System.out.println(min);
            } else {
                System.out.println(-1);
            }
        }
    }
}