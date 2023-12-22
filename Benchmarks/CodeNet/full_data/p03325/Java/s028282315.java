import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        String[] line = Io.read();
        int n = Integer.parseInt(line[0]);
        long[] a = parse(line[1]);

        int answer = Counter.count(n, a);

        Io.write(answer);
    }

    private static long[] parse (String line) {
        String[] split = line.split(" ");

        long[] parsed = new long[split.length];

        for (int i = 0; i < split.length; i++) {
            parsed[i] = Integer.parseInt(split[i]);
        }
        return parsed;
    }
}

class Counter {

    public static int count(int n, long[] a) {
        return Arrays.stream(a).limit(n).mapToInt(Counter::calcNTZ).sum();
    }

    private static int calcNTZ(long x) { return Long.bitCount((x & (-x)) - 1); }
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