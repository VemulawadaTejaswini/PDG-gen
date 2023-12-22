import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {

        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(is);

        String s = reader.readLine();

        Integer a = Integer.valueOf(s);

        if (a % 2 == 0) {
            System.out.println("0.5");
        } else {
            System.out.println(((a / 2) + 1) / (double) a);
        }
    }

}