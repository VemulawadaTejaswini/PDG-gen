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
            List<Integer> numbers = new ArrayList<>();

            for (String s : input) {
                numbers.add(Integer.parseInt(s));
            }

            int ApulsB = numbers.get(0) + numbers.get(1);
            int AmultiplyB = numbers.get(0) * numbers.get(1);
            int AminusB = numbers.get(0) - numbers.get(1);

            List<Integer> calculatedNubmers = Arrays.asList(ApulsB, AmultiplyB, AminusB);
            sortNatualOrder(calculatedNubmers);
            
            System.out.println(calculatedNubmers.get(calculatedNubmers.size() - 1));
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }

    private static void sortNatualOrder(List<Integer> intList) {
        for (int i = 0; i < intList.size() - 1; i++) {
            for (int j = intList.size() - 1; j > i; j--) {
                if (intList.get(j - 1) > intList.get(j)) {
                    int tmp = intList.get(j - 1);
                    intList.set(j - 1, intList.get(j));
                    intList.set(j, tmp);
                }
            }
        }
    }
}