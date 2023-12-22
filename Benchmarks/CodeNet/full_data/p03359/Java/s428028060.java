import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            List<String> inputString = Arrays.asList(br.readLine().split(" "));
            int month = Integer.parseInt(inputString.get(0));
            int day = Integer.parseInt(inputString.get(1));

            int takahashiDayCount = 0;

            for (int i = 1; i <= month; i++) {
                if (i <= day || !(i == month)) {
                    takahashiDayCount += 1;
                }
            }

            System.out.println(takahashiDayCount);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}