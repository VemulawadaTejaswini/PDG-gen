import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String[] input = br.readLine().split(" ");
            int trainCharge = Integer.parseInt(input[0]);
            int dicountBusCharge = Integer.parseInt(input[1]) / 2;
            int sumCharge = trainCharge + dicountBusCharge;

            System.out.println(sumCharge);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}