import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String ans = "";
        
        for (int i = 0; i < s.length(); i += 2) {
            ans += String.valueOf(s.charAt(i));
        }
        
        System.out.println(ans);
    }
}
