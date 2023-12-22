import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

class Main {
    public static void main(final String[] args) throws Exception {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            List<String> inputString = Arrays.asList(br.readLine().split(""));
            int start = 0;
            int end = 0;
            
            for (int i = 0; i < inputString.size(); i++) {
                if (inputString.get(i).equals("A")) {
                    start = i;
                    break;
                }
            }

            for (int i = start; i < inputString.size(); i++) {
                if (inputString.get(i).equals("Z")) {
                    end = i;
                    break;
                }
            }

            int ans = end - start + 1;
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