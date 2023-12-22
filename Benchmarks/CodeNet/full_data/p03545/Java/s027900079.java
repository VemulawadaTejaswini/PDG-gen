
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.lang.System.in;

public class Main {

    public static int[] intInputs = new int[4];

    static String combination = "";

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        char[] inputs = reader.readLine().toCharArray();
        for (int i = 0; i < 4; i++) {
            intInputs[i] = Character.getNumericValue(inputs[i]);
        }
        String suffix = "=7";
        solve(1, intInputs[0], 7, "");

        StringBuilder result = new StringBuilder("" + String.valueOf(intInputs[0]));
        for (int i = 0; i < 3; i++) {
            result
                    .append(combination.charAt(i))
                    .append(String.valueOf(intInputs[i + 1]));
        }

        System.out.println(result + suffix);

    }

    public static void solve(int index, int currentValue, int targetValue, String base) {
        if (index == 4 && currentValue == targetValue) {
            combination = base;
        } else if (index < 4) {
            solve(index + 1, currentValue + intInputs[index], targetValue, base + "+");
            solve(index + 1, currentValue - intInputs[index], targetValue, base + "-");
        }
    }


}
