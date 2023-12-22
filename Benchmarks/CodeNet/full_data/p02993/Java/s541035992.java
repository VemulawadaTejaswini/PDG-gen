import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String pin = reader.readLine();
            char[] chars = pin.toCharArray();
            char prev = ' ';
            boolean first = true;
            for (char c : chars) {
                if (!first) {
                    if (prev == c) {
                        System.out.println("Bad");
                        return;
                    }
                }
                first = false;
                prev = c;
            }
            System.out.println("Good");
        }
    }

}