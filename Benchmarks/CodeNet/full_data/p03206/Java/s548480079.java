import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int d = Integer.parseInt(br.readLine());
        System.out.println(problem115a(d));
    }

    private static String problem115a(int d) {
        StringBuilder sb = new StringBuilder("Christmas");
        for (int i = 0; i < (25 - d); i++) {
            sb.append(" Eve");
        }
        return sb.toString();
    }
}