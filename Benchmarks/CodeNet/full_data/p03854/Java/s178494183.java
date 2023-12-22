import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        String[] words = {"eraser", "dreamer", "erase", "dream"};

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String S = null;
        try {
            S = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String answer = "YES";
        boolean isMatch = false;
        while (S.length() > 0) {
            isMatch = false;
            for (String word : words) {
                if (S.endsWith(word)) {
                    isMatch = true;
                    S =  new String(S.substring(0, S.lastIndexOf(word)));
                    break;
                }
            }
            if (!isMatch) {
                answer = "NO";
                break;
            }

        }

        System.out.format(answer);
    }
}