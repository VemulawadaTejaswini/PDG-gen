import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
	    String[] input = Io.read();

	    int[] info = parse(input);

	    int ans = calc(info[0], info[1], info[2], info[3]);

	    Io.write(ans);
    }

    private static int[] parse(String[] inputStr) {
        int[] result = new int[inputStr.length];

        for (int i = 0; i < inputStr.length; i++) {
            result[i] = Integer.parseInt(inputStr[i]);
        }

        return result;
    }

    private static int calc(int n, int k, int x, int y) {
        int result = 0;

        if (n >= k) {
            result += k * x;
            result += (n - k) * y;
        } else {
            result += n * x;
        }


        return result;
    }
}

class Io {

    /**
     * 標準入力から1行ずつ受け取る
     * @return
     * @throws IOException
     */
    public static String[] read() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> inputs = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null) {
            if (line.equals(""))
                break;

            inputs.add(line);
        }
        br.close();
        return inputs.toArray(new String[0]);
    }

    /**
     * 標準出力
     * @param answer
     */
    public static void write(int answer)
    {
        System.out.println(answer);
    }
}