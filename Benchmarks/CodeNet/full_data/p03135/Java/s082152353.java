import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tx = br.readLine().split(" ");
        int t = Integer.parseInt(tx[0]);
        int x = Integer.parseInt(tx[1]);
        System.out.println(problem117a(t, x));
    }

    private static String problem117a(int t, int x) {
        return String.format("%.10f", ((t * 1d) / x));
    }
}