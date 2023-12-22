import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

import static java.lang.Character.toUpperCase;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = br.readLine();
            StringTokenizer s = new StringTokenizer(str, " ");
            for(int i = 0; i < 3; i++) {
                char c = toUpperCase(s.nextToken().charAt(0));
                System.out.print(c);
            }
        } catch (IOException e) {
            System.out.println("error");
        }
    }
}