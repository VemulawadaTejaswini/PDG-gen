import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            List<String> inputNumbers = Arrays.asList(br.readLine().split(" "));
            List<Integer> numbers = new ArrayList<>();

            for (String inputNumber : inputNumbers) {
                numbers.add(Integer.parseInt(inputNumber));
            }

            numbers.sort((i1, i2) -> i1 - i2);

            int firstCost = numbers.get(1) - numbers.get(0);
            int secondCost = numbers.get(2) - numbers.get(1);
            int sumCost = firstCost + secondCost;

            System.out.println(sumCost);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}