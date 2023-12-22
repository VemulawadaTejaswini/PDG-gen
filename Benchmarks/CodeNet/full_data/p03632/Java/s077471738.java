import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] abcd = br.readLine().split(" ");
        int a = Integer.parseInt(abcd[0]);
        int b = Integer.parseInt(abcd[1]);
        int c = Integer.parseInt(abcd[2]);
        int d = Integer.parseInt(abcd[3]);
        
        int ans = Math.min(b, d) - Math.max(a, c);
        System.out.println(Math.max(ans, 0));
    }
}
