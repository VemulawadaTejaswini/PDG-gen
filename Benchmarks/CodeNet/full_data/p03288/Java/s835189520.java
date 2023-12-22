import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Atcoder104B {
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String word = input.readLine();
        System.out.println(word.matches("$A[a-z]C[a-z]+^")?"AC":"WA");
    }
}
