import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // Here your code !
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] word = line.sprit(" ");
        char a = word[0].charAt(0);
        char b = word[1].charAt(0);
        char c = word[2].charAt(0);
        System.out.println(a + b + c);
    }
}