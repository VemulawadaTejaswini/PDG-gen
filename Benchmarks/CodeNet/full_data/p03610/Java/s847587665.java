import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s.length(); i += 2) {
            sb.append(s.charAt(i));
        }
        
        System.out.println(sb.toString());
    }
}
