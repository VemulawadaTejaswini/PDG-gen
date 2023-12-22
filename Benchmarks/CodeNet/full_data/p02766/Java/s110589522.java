import javax.print.DocFlavor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class  Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] l = reader.readLine().split(" ");
        int N = Integer.parseInt(l[0]);
        int K = Integer.parseInt(l[1]);
        System.out.println(1+(int) (Math.log(N)/Math.log(K)));
    }
}
