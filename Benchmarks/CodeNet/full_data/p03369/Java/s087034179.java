import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            List<String> toppingSheet = Arrays.asList(br.readLine().split(""));

            int ramenPrice = 700;
            int toppingPrice = 100;
            for (String topping : toppingSheet) {
                if (topping.equals("o")) {
                    ramenPrice += toppingPrice;
                }
            }

            System.out.println(ramenPrice);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}