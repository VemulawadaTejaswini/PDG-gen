import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");
        long n = Long.parseLong(in[0]);
        long m = Long.parseLong(in[1]);
        long answer = (n * 2 < m) ? (n + m / 4) : (m / 2);
        System.out.println(answer);
    }
}