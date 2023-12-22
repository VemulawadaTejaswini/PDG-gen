import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] ab = br.readLine().split(" ");
        int a = Integer.parseInt(ab[0]);
        int b = Integer.parseInt(ab[1]);
        System.out.println(problem127a(a, b));
    }

    private static int problem127a(int a, int b) {
        if (a >= 13) {
            return b;
        } else if (a <= 5) {
            return 0;
        }
        return (b / 2);
    }
}