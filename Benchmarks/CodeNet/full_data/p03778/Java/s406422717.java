import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

class Main {
    public static void main(final String[] args) throws Exception {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            List<String> inputString = Arrays.asList(br.readLine().split(" "));
            int W = Integer.parseInt(inputString.get(0));
            int a = Integer.parseInt(inputString.get(1));
            int b = Integer.parseInt(inputString.get(2));

            int ans = 0;
            if (a + W < b) {
                ans = b - a + W;
            } else if (a + W >= b && a + W <= b + W) {
                ans = 0;
            } else if (b + W <= a + W && b + W >= a) {
                ans = 0;
            } else {
                ans = a - b + W;
            }

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