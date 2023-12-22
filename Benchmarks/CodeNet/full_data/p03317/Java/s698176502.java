import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
	    String[] inputs = Io.read();
	    String[] metaStr = inputs[0].split(" ");

	    int n = Integer.parseInt(metaStr[0]);
	    int k = Integer.parseInt(metaStr[1]);

	    int tmp = n - k;
	    int cnt = 1;

	    float mod = tmp % (k - 1);
	    cnt += tmp / (k - 1);

	    if (mod > 0) cnt++;

	    Io.write(cnt);
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