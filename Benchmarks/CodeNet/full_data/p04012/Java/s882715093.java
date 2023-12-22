import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws Exception {
	    String input = Io.read();
	    Character[] arr = new Character[input.length()];

	    for (int i = 0; i < input.length(); i++) {
	        arr[i] = input.charAt(i);
        }

	    Set<Character> charSet = toSet(arr);

	    String ans = "Yes";
	    for (char c : charSet) {
            long cnt = Arrays.stream(arr).filter(x -> x.equals(c)).count();
            if ((cnt & 1) == 1) {
                ans = "No";
                break;
            }
        }
        Io.write(ans);
    }

    private static Set<Character> toSet(Character[] arr) {
        Set<Character> charSet = new HashSet<>();

        for (char c : arr) {
            charSet.add(c);
        }

        return charSet;
    }
}

class Io {

    /**
     * 標準入力から1行ずつ受け取る
     * @return
     * @throws IOException
     */
    public static String read() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        br.close();
        return line;
    }

    /**
     * 標準出力
     * @param answer
     */
    public static void write(String answer)
    {
        System.out.println(answer);
    }
}