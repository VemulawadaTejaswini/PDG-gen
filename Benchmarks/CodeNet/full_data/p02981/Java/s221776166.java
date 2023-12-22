import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nab = br.readLine().split(" ");
        int n = Integer.parseInt(nab[0]);
        int a = Integer.parseInt(nab[1]);
        int b = Integer.parseInt(nab[2]);
        System.out.println(problem133a(n, a, b));
    }

    private static int problem133a(int n, int a, int b) {
        return Math.min((n * a), b);
    }
}