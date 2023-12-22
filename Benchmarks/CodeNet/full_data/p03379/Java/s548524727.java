
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x[] = new int[n];
        int buf[] = new int[n];
        for (int ct = 0; ct < x.length; ct++) {
            x[ct] = sc.nextInt();
            buf[ct] = x[ct];
        }
        
        Arrays.sort(buf);

        if (buf[n / 2-1] < buf[n / 2]) {
            for (int oki : x) {
                if (oki <= buf[n / 2-1]) {
                    System.out.println(buf[n / 2 ]);
                } else {
                    System.out.println(buf[n / 2-1]);
                }
            }
        } else {
            for (int ct = 0; ct < x.length; ct++) {
                System.out.println(buf[n / 2-1]);
            }
            System.exit(0);
        }
    }
}
