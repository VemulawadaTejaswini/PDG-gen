import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        String[] inputs = Io.read();
        String[] meta = inputs[0].split(" ");

        int N = Integer.parseInt(meta[0]);
        int M = Integer.parseInt(meta[1]);

        long[][] parsed = parse(inputs, N);

        Arrays.sort(parsed, (a, b) -> Long.compare(a[0], b[0]));

        long cost = 0;
        for (int i = 0; i < parsed.length; i++) {
            if (M <= parsed[i][1]) {
                cost += parsed[i][0] * M;
                M = 0;
                break;
            }
            cost += parsed[i][0] * parsed[i][1];
            M -= parsed[i][1];
        }
        Io.write(cost);
    }

    private static long[][] parse(String[] lines, int N) {
        long[][] parsed = new long[N][2];
        for (int i = 0; i < N; i++) {
            String[] line = lines[i + 1].split(" ");
            parsed[i][0] = Long.parseLong(line[0]);
            parsed[i][1] = Long.parseLong(line[1]);
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
    public static void write(long answer)
    {
        System.out.println(answer);
    }
}
