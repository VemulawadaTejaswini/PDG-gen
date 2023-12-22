

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created on 2018/03/02 19:17.
 */
public class Main{
    public static void main(String[] args) throws IOException {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int t[] = new int[3];
            for (int i = 0; i < 3; i++) {
                t[i] = sc.nextInt();
            }
            Arrays.sort(t);
            if (t[0] == 5 && t[1] == 5 && t[2] == 7) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
