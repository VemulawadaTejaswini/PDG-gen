import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
	    String[] inputs = Io.read();

	    String[] metas = inputs[0].split(" ");
	    int m = Integer.parseInt(metas[1]);

	    long[][] values = parse(inputs);

        long ans = Calc.calc(m, values);

        Io.write(ans);
    }

    private static long[][] parse(String[] inputs) {
        long[][] parsed = new long[inputs.length - 1][3];

        for (int i = 1; i < inputs.length; i++) {
            String[] line = inputs[i].split(" ");
            parsed[i - 1][0] = Long.parseLong(line[0]);
            parsed[i - 1][1] = Long.parseLong(line[1]);
            parsed[i - 1][2] = Long.parseLong(line[2]);
        }
        return parsed;
    }
}

class Calc {

    public static long calc(int m, long[][] values) {
        int ratio[][] = {
                {1, 1, 1},
                {1, 1, -1},
                {1, -1, 1},
                {1, -1, -1},
                {-1, 1, 1},
                {-1, 1, -1},
                {-1, -1, 1},
                {-1, -1, -1},
        };
        long maxValue = 0;

        for (int[] r : ratio) {
            long candidate = Arrays.stream(values).mapToLong(x -> {
                long v = x[0] * r[0];
                v += x[1] * r[1];
                v += x[2] * r[2];
                return v;
            }).sorted().skip(values.length - m).sum();

            if (maxValue <= candidate) maxValue = candidate;
        }

        return maxValue;
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