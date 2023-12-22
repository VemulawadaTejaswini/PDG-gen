import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String word = input.readLine();
        int [] freq = new int[26];
        for (int i = 0; i < word.length(); i++) {
            freq[word.charAt(i) -'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if ((freq[i] & 1) != 0){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
