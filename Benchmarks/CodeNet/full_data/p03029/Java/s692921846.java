import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] ap = br.readLine().split(" ");
        int a = Integer.parseInt(ap[0]);
        int p = Integer.parseInt(ap[1]);
        System.out.println(problem128a(a, p));
    }

    private static int problem128a(int a, int p) {
        return (a * 3 + p) / 2;
    }
}