import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] inputs = null;
        int n = 0;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line = br.readLine();
            n = Integer.parseInt(line);
            inputs = new String[n];
            for (int i = 0; i < n; i++) {
                inputs[i] = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        int[] mins = new int['z' - 'a' + 1];
        Arrays.fill(mins, 100);
        int[] tmp = new int[mins.length];
        for (int i = 0; i < n; i++) {
            char[] cs = inputs[i].toCharArray();
            Arrays.fill(tmp, 0);
            for (char c: cs) {
                tmp[c - 'a']++;
            }
            for (int j = 0; j < mins.length; j++) {
                if (mins[j] > tmp[j])
                    mins[j] = tmp[j];
            }
        }
        for (int i = 0; i < mins.length; i++) {
            for (int j = 0; j < mins[i]; j++)
                System.out.printf("%c", i+'a');
        }
    }
}
