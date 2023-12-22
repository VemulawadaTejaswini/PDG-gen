import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] s = br.readLine().toCharArray();
        int num1 = 0;
        int num2 = 0;
        for(int i = 0; i < s.length; i++) {
            boolean b = i % 2 == 0;
            if(b && s[i] == '1' || !b && s[i] == '0') num1++;
            else num2++;
        }

        System.out.println(Math.min(num1, num2));
    }
}