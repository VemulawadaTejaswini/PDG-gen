import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
	    String line = Io.read();
	    int num = Integer.parseInt(line);

	    int digits = (int)Math.log10(num) + 1;
        int div = 0;

        int tmp = num;
        for (int i = 0; i < digits; i++) {
            div += tmp % 10;
            tmp = tmp / 10;
        }

        if (num % div == 0) Io.write("Yes");
        else Io.write("No");
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