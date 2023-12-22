import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Main {
    public static void main(final String[] args) throws Exception {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            List<String> firstRow = Arrays.asList(br.readLine().split(""));
            List<String> secondRow = Arrays.asList(br.readLine().split(""));

            StringBuilder ans = new StringBuilder();

            if (firstRow.size() > secondRow.size()) {
                for (int i = 0; i < secondRow.size(); i++) {
                    if (i == secondRow.size() - 1) {
                        ans.append(firstRow.get(i + 1));
                    }
                    ans.append(firstRow.get(i)).append(secondRow.get(i));
                }
            } else if (firstRow.size() < secondRow.size()) {
                for (int i = 0; i < firstRow.size(); i++) {
                    if (i == firstRow.size() - 1) {
                        ans.append(secondRow.get(i + 1));
                    }
                    ans.append(firstRow.get(i)).append(secondRow.get(i));
                }
            } else if (firstRow.size() == secondRow.size()) {
                for (int i = 0; i < firstRow.size(); i++) {
                    ans.append(firstRow.get(i)).append(secondRow.get(i));
                }
            }

            System.out.println(ans);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}