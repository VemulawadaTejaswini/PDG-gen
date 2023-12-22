import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int count = Integer.parseInt(br.readLine());
            List<Integer> numberList = new ArrayList<>();
            for (int i = 1; i <= count; i++) {
                if ((i % 3 == 0 && i % 5 == 0) || i % 3 == 0 || i % 5 == 0) {
                    continue;
                } else {
                    numberList.add(i);
                }
            }

            int result = 0;
            for (int number : numberList) {
                result += number;
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