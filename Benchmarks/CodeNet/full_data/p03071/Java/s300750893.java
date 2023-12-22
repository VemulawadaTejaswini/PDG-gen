import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            List<String> input = Arrays.asList(br.readLine().split(" "));
            List<Integer> countCoins = new ArrayList<>();

            for (String s : input) {
                countCoins.add(Integer.parseInt(s));
            }

            sortNatualOrder(countCoins);

            int countOfCoinA = countCoins.get(0);
            int countOfCoinB = countCoins.get(1);

            int result = countOfCoinA + countOfCoinB;
            if (result < countOfCoinB * 2 - 1) {
                result = countOfCoinB * 2 - 1;
            }

            System.out.println(result);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }

    private static void sortNatualOrder(List<Integer> intList) {
        int tmp = intList.get(1);
        if (intList.get(0) > intList.get(1)) {
            intList.set(1, intList.get(0));
            intList.set(0, tmp);
        }
    }
}