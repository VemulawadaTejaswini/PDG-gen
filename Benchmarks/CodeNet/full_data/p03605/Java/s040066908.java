import java.io.*;

public class September9 {
    public static void main (String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String str;

        try {
            str = br.readLine();

            if (str.indexOf("9") == -1) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}