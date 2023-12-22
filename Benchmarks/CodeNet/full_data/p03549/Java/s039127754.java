import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        String[] inputs = reader.readLine().split(" ");
        long N = Long.parseLong(inputs[0]);
        long M = Long.parseLong(inputs[1]);
        long answer = ((N-M) * 100 + 1900 * M) * (long)Math.pow(2,M);
        System.out.println(answer);
    }
}