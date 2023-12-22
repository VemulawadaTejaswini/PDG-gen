import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String[] inputDays = br.readLine().split(" ");
            int bestByDate = Integer.parseInt(inputDays[0]);
            int boughtDayBeforeOfBestByDate = Integer.parseInt(inputDays[1]);
            int ateDayAfterOfBoughtDay = Integer.parseInt(inputDays[2]);
            int statusOfFoodInInteger = boughtDayBeforeOfBestByDate - ateDayAfterOfBoughtDay + bestByDate;
            String statusOfFood = statusOfFoodInInteger > 0 ? "delicious" : statusOfFoodInInteger == 0 ? "safe" : "dengerous";

            System.out.println(statusOfFood);

        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}