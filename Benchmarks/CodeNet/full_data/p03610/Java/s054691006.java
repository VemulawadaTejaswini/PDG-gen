import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {

    int[] inputArray;

    public static void main(String[] args) throws IOException {
        new Main().run();
    }

    void run() {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        String ans = "";

        for(int i=0; i<s.length; i++){
            String input = String.valueOf(s[i]);

            if((i+1) % 2 != 0){
                ans += input;
            }
        }

        System.out.println(ans);
    }

}