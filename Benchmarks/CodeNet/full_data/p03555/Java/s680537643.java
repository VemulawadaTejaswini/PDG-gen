import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            List<String> firstRow = Arrays.asList(br.readLine().split(""));
            List<String> secondRow = Arrays.asList(br.readLine().split(""));
            swap(secondRow, 0, 2);

            if (firstRow.equals(secondRow)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }

    static void swap(List<String> list, int index1, int index2) {
        String tmp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, tmp);
    }
}