import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        String[] c = new String[h];
        for (int i = 0; i < h; i++) {
            c[i] = sc.next();
        }
        for (int j = 0; j < h; j++) {
            for (int i = 0; i < 2; i++) {
                System.out.println(c[j]);
            }
        }
    }
}
