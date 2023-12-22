import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
	    int n = Io.read();

	    if ((n & 1) == 0) Io.write(n);
	    else Io.write(n * 2);
    }
}

class Io {

    /**
     * 標準入力から1行ずつ受け取る
     * @return
     * @throws IOException
     */
    public static int read() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        br.close();
        return Integer.parseInt(line);
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