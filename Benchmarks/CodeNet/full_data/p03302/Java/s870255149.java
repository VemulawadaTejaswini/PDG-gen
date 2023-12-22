import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

    public static void main(String[] args) throws Exception {
	    String line = Io.read();
	    int[] parsed = parse(line);

	    if (parsed[0] + parsed[1] == 15) {
	        Io.write("+");
        } else if (parsed[0] * parsed[1] == 15) {
	        Io.write("*");
        } else {
            Io.write("x");
        }
    }

    private static int[] parse(String line) {
        String[] split = line.split(" ");
        int[] parsed = new int[split.length];

        for (int i = 0; i < split.length; i++) {
            parsed[i] = Integer.parseInt(split[i]);
        }
        return parsed;
    }
}

class Io {

    public static String read() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        br.close();
        return line;
    }

    public static void write(String answer)
    {
        System.out.println(answer);
    }
}