import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Main {
    public static void main(final String[] args) throws Exception {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            List<String> aString = Arrays.asList(br.readLine().split(""));
            List<String> bString = Arrays.asList(br.readLine().split(""));

            List<Integer> A = new ArrayList<>();
            for (String str : aString) {
                A.add(Integer.parseInt(str));
            }

            List<Integer> B = new ArrayList<>();
            for (String str : bString) {
                B.add(Integer.parseInt(str));
            }

            String ans = "EQUAL";
            if (A.size() > B.size()) {
                ans = "GREATER";
            } else if (A.size() < B.size()) {
                ans = "LESS";
            } else if (A.size() == B.size()) {
                for (int i = 0; i < A.size(); i++) {
                    if (A.get(i) == B.get(i)) {
                        continue;
                    } else if (A.get(i) > B.get(i)) {
                        ans = "GREATER";
                        break;
                    } else if (A.get(i) < B.get(i)) {
                        ans = "LESS";
                        break;
                    }
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