import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public void main() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String input[] = br.readLine().split(" ");

            println(input[0].equals(input[1]) ? "H" : "D");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void print(Object o) {
        System.out.print(o);
    }

    public void println(Object o) {
        System.out.println(o);
    }

    public static void main(String[] args) {
        new Main().main();
    }
}
