import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            long n = Long.parseLong(br.readLine());
            long count = 0;

            for (long i = 5; n / i >= 1; i *= 5)
                count += n / i;

            System.out.println(count/2);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}