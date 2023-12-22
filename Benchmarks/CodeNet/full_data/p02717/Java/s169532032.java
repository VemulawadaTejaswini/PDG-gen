import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            List<String> input = Arrays.asList(br.readLine().split(" "));
            abcSwap(input);

            StringBuilder result = new StringBuilder();
            for (int i = 0; i < input.size(); i++) {
                if (i == input.size() - 1) {
                    result.append(input.get(i));
                } else {
                    result.append(input.get(i)).append(" ");
                }
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

    private static void abcSwap(List<String> input) {
        String tmp = input.get(1);
        // A and B swap
        input.set(1, input.get(0));
        input.set(0, tmp);

        // A and C swap
        tmp = input.get(2);
        input.set(2, input.get(0));
        input.set(0, tmp);
    }
}