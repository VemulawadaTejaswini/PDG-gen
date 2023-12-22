import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String[] array = reader.readLine().split(" ");
            int A = Integer.parseInt(array[0]);
            int B = Integer.parseInt(array[1]);

            if ((A + B) % 2 == 1) {
                System.out.println("IMPOSSIBLE");
            } else {
                System.out.println((A + B) / 2);
            }
        }
    }

}
