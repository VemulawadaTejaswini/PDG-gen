import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String args[]) {
        int r, g, b;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String buf = br.readLine();
            String color[] = buf.split(" ");
            r = Integer.parseInt(color[0]);
            g = Integer.parseInt(color[1]);
            b = Integer.parseInt(color[2]);

            int num = g * 10 + b;
            if ((num % 4) == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } catch(Exception e) {
            System.err.println("Exception: " + e);
        }
    }
}