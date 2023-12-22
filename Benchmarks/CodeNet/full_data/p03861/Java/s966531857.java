import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

class Main {
    public static void main(final String[] args) throws Exception {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            List<String> input = Arrays.asList(br.readLine().split(" "));
            long a = Long.parseLong(input.get(0));
            long b = Long.parseLong(input.get(1));
            long x = Long.parseLong(input.get(2));

            long ans = b / x - a / x;
            if (a % x == 0) ans ++;


            System.out.println(ans);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);  
        }
    }
}