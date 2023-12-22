import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] tmp = br.readLine().split(" ");
        int a = Integer.parseInt(tmp[0]);
        int b = Integer.parseInt(tmp[1]);
        int c = Integer.parseInt(tmp[2]);
        
        if(a < c && c < b || a > c && c > b) System.out.println("Yes");
        else System.out.println("No");

        br.close();
    }
}