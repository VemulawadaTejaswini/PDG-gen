import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        String[] inputs = Io.read();
        int[] a = parse(inputs[1]);

        int[] baseLine = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            baseLine[i] = i + 1;
        }

        int diff = calsDiff(a, baseLine, 0);

        if (diff == 0) {
            Io.write(calsSad(0, a));
        } else if (diff > 0) {
            int b = diff;
            int c;
            int ans;
            for (int i = 0;; i++) {
                c = calsDiff(a, baseLine, i);
                if (c >= b || c < 0) {
                    ans = i;
                    break;
                }

                b = c;
            }
            Io.write(calsSad(ans, a));
        } else {
            int b = diff;
            int c;
            int ans;
            for (int i = -1;; i--) {
                c = calsDiff(a, baseLine, i);
                if (c <= b || c >= 0) {
                    ans = i;
                    break;
                }

                b = c;
            }
            Io.write(calsSad(ans, a));
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

    private static int calsDiff(int[] a, int[] b, int d) {
        int diff = 0;
        for (int i = 0; i < b.length; i++) {
            diff += a[i] - (d + b[i]);
        }
        return diff;
    }

    private static long calsSad(int b, int[] a) {
        long result = 0;
        for (int i = 0; i < a.length; i++) {
            result += Math.abs(a[i] - (b + i + 1));
        }

        return result;
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