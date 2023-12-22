import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
	    String[] lines = Io.read();

	    String baseStr = lines[1];
	    int[][] questions = parse(lines);

	    int count = 0;
	    for (int i = 0; i < questions.length; i++) {
	        String sub = baseStr.substring(questions[i][0] - 1, questions[i][1]);

	        String replaced = sub.replaceAll("AC", "");

            Io.write((sub.length() - replaced.length()) / 2);
        }
    }

    private static int[][] parse(String[] lines) {
        String[] first = lines[0].split(" ");

        int q = Integer.parseInt(first[1]);
        int[][] parsed = new int[q][2];

        for (int i = 0; i < q; i++) {
            String[] tmp = lines[i + 2].split(" ");
            parsed[i][0] = Integer.parseInt(tmp[0]);
            parsed[i][1] = Integer.parseInt(tmp[1]);
        }
        return parsed;
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