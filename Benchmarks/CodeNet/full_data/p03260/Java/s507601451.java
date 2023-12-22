import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] ab = br.readLine().split(" ");
        int a = Integer.parseInt(ab[0]);
        int b = Integer.parseInt(ab[1]);
        System.out.println(problem109a(a, b));
    }

    private static String problem109a(int a, int b) {
        for (int c = 1; c <= 3; c++) {
            int times = a * b * c;
            if (times % 2 == 1) {
                return "Yes";
            }
        }
        return "No";
    }
}