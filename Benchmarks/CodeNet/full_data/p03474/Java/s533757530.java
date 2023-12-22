import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Main {
    public static void main(final String[] args) throws Exception {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            List<String> inputNumberString = Arrays.asList(br.readLine().split(" "));
            int A = Integer.parseInt(inputNumberString.get(0));
            int B = Integer.parseInt(inputNumberString.get(1));

            List<String> postNumber = Arrays.asList(br.readLine().split("-"));

            if (postNumber.size() != 2) {
                System.out.println("No");
                return;
            }

            if (postNumber.get(0).length() != A) {
                System.out.println("No");
                return;
            }

            if (postNumber.get(1).length() != B) {
                System.out.println("No");
                return;
            }

            System.out.println("Yes");
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}