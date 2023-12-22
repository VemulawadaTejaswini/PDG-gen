import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (
                Scanner in = new Scanner(System.in);
                PrintWriter out = new PrintWriter(System.out))
        {
            String text = in.next();

            if (text.length() == 2) {
                out.println(text);
            } else if (text.length() == 3) {
                out.println(new StringBuilder(text).reverse());
            }
        }
    }
}
