import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws Exception {
        BufferedReader inut = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(inut.readLine());

        for (int i = 0; i <= 25; i++) {
            for (int j = 0; j <= 25; j++) {
                if ((i*4) + (j*7) == n) {
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
    }
}
