import java.io.*;

/**
 * Created by Ayushi on 18/08/2019.
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = r.readLine().split(" ");
        int n = Integer.parseInt(temp[0]);
        String a = r.readLine();
        r.close();
        if (n >= 3200) System.out.println(a);
        else System.out.println("red");
    }
}
