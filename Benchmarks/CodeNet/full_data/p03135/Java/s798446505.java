import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String[] input = br.readLine().split(" ");
            double thisWorldTime = Double.parseDouble(input[0]);
            double addSpeed = Double.parseDouble(input[1]);
            BigDecimal elapsedTimeOnFastWorld = new BigDecimal(thisWorldTime / addSpeed);

            System.out.println(elapsedTimeOnFastWorld.setScale(10, RoundingMode.HALF_UP));
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}