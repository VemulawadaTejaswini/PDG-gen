import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
	    String[] inputs = Io.read();
	    String s = inputs[0];
	    int x = Integer.parseInt(inputs[1]);

	    StringBuilder builder = new StringBuilder();

	    for (int i = 0; i < s.length(); i++) {
	        if (i % x == 0) {
	            builder.append(s.charAt(i));
            }
        }
        String ans = builder.toString();

	    Io.write(ans);
    }
}

class Io {

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

    public static void write(String answer)
    {
        System.out.println(answer);
    }
}