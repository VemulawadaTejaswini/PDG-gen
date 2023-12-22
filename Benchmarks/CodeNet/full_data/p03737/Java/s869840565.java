import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String[] inputWords = br.readLine().split(" ");
            String firstAbbreviation = getInitialInCapital(inputWords[0]);
            String secondAbbreviation = getInitialInCapital(inputWords[1]);
            String thirdAbbreviation = getInitialInCapital(inputWords[2]);

            System.out.println(firstAbbreviation + secondAbbreviation + thirdAbbreviation);

        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }

    private static String getInitialInCapital(String word) {
        return word.substring(0, 1).toUpperCase();
    }
}