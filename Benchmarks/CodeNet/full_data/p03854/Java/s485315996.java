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
        String stest = S;
        while (stest.length() > 0) {
            isMatch = false;
            for (String word : words) {
                if (stest.endsWith(word)) {
                    isMatch = true;
                    int lastIndex = S.lastIndexOf(word);
                    stest =  S.substring(0, lastIndex);
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