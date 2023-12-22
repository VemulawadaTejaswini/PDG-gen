import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String[] inputNumbers = br.readLine().split(" ");
            int firstNumber = Integer.parseInt(inputNumbers[0]);
            int secondNumber = Integer.parseInt(inputNumbers[1]);
            int thirdNumber = Integer.parseInt(inputNumbers[2]);

            if (thirdNumber >= firstNumber && thirdNumber <= secondNumber) {
                System.out.println("Yes");

            } else {

                System.out.println("No");

            }

        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}