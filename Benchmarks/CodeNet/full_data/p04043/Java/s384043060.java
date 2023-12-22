import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
	    String line = Io.read();
	    int[] nums = Arrays.stream(line.split(" "))
                .mapToInt(num -> Integer.parseInt(num))
                .toArray();

	    int count5 = 0, count7 = 0;
        for(int num : nums) {
            if (num == 5) {
                count5++;
            } else if (num == 7) {
                count7++;
            }
        }

	    if (count5 == 2 && count7 == 1) {
	        Io.write("YES");
        } else {
	        Io.write("NO");
        }
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

        return line;
    }

    /**
     * 標準出力
     * @param line
     */
    public static void write(String line)
    {
        System.out.println(line);
    }
}