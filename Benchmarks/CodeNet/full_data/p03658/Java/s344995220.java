import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Main {
    public static void main(final String[] args) throws Exception {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            List<String> firstRow = Arrays.asList(br.readLine().split(" "));
            int N = Integer.parseInt(firstRow.get(0));
            int K = Integer.parseInt(firstRow.get(1));

            List<String> secondRow = Arrays.asList(br.readLine().split(" "));
            List<Integer> lengthList = new ArrayList<>();
            for (String str : secondRow) {
                lengthList.add(Integer.parseInt(str));
            }

            sortNaturalOrder(lengthList);

            int ans = 0;
            for (int i = lengthList.size() - 1; K > 0; i--) {
                ans += lengthList.get(i);
                K--;
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

    private static void sortNaturalOrder(List<Integer> intList) {
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