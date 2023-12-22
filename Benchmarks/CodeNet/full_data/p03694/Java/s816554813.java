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
            // Nは使用しないので読み込むだけ
            br.readLine();

            List<String> housePlaceStringList = Arrays.asList(br.readLine().split(" "));
            List<Integer> housePlaceList = new ArrayList<>();
            for (String str : housePlaceStringList) {
                housePlaceList.add(Integer.parseInt(str));
            }

            sortNatualOrder(housePlaceList);

            int ans = 0;
            ans = housePlaceList.get(housePlaceList.size() - 1) - housePlaceList.get(0);
            System.out.println(ans);
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