import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            List<String> firstRow = Arrays.asList(br.readLine().split(""));
            List<String> secondRow = Arrays.asList(br.readLine().split(""));

            int result = 0;
            for (int i = 0; i < 3; i++) {
                if (firstRow.get(i).equals(secondRow.get(i))) {
                    result += 1;
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
}