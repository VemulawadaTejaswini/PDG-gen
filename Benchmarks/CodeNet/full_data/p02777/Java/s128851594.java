import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            List<String> firstRow = Arrays.asList(br.readLine().split(" "));
            List<String> secondRow = Arrays.asList(br.readLine().split(" "));
            String thirdRow = br.readLine();

            List<Integer> ballsCount = new ArrayList<>();
            for (String s : secondRow) {
                ballsCount.add(Integer.parseInt(s));
            }

            Map<String, Integer> ballsCountAndColor = new HashMap<>();

            for (int i = 0; i < firstRow.size(); i++) {
                ballsCountAndColor.put(firstRow.get(i), ballsCount.get(i));
            }

            ballsCountAndColor.put(thirdRow, ballsCountAndColor.get(thirdRow).intValue() - 1);

            System.out.print(ballsCountAndColor.get(firstRow.get(0)).intValue() + " "
                    + ballsCountAndColor.get(firstRow.get(1)).intValue());
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}