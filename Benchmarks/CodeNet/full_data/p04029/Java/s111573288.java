import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        int j = 0;

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        try {
            int i = Integer.parseInt(br.readLine());
            if (0 <= i && i <= 100) {
                for (int k = 1; k <= i; k++) {
                    j = j + k;
                }
            }
            System.out.println(j);
        } catch (NumberFormatException | IOException e) {
        }
    }
}