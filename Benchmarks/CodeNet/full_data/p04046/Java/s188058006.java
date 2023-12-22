import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
	    String line = Io.read();
	    int[] info = parse(line);

        Explorer exp = new Explorer(info);

        Io.write(exp.compute());
    }

    private static int[] parse(String line) {
        String[] inputsStr = line.split(" ");
        int[] result = new int[inputsStr.length];

        for (int i = 0; i < inputsStr.length; i++) {
            result[i] = Integer.parseInt(inputsStr[i]);
        }

        return result;
    }
}

class Explorer {
    final private int mod = 1000000000 + 7;

    private int height;
    private int width;

    private int blockHeight;
    private int blockWidth;

    private long[] modFactorial;
    private long[] invModFactorial;

    public Explorer(int[] info) {
        height = info[0];
        width = info[1];

        blockHeight = info[2];
        blockWidth = info[3];

        modFactorial = new long[height + width + 1];
        invModFactorial = new long[height + width + 1];

        modFactorial[0] = 1;
    }

    public int compute() {
        initModFactorial();
        initInvModFactorial();

        long sum = 0;
        for (int i = 0; i < width - blockWidth; i++) {
            long first = combMod(blockWidth + height - blockHeight + i - 1, blockWidth + i) % mod;
            long second = first * combMod(width - blockWidth - i + blockHeight - 2, blockHeight - 1) % mod;

            sum += second;
        }

        return (int)(sum % mod);
    }

    private void initModFactorial() {
        for (int i = 1; i <= height + width; i++) {
            modFactorial[i] = (i * modFactorial[i - 1]) % mod;
        }
    }

    private void initInvModFactorial() {
        long lastInvModFactorial = binaryPower(modFactorial[height + width], mod - 2);
        invModFactorial[height + width] = lastInvModFactorial;

        for (int i = height + width; i > 0; i--) {
            invModFactorial[i - 1] = (invModFactorial[i] * i) % mod;
        }
    }

    private long binaryPower(long x, long p) {
        if (p == 0) {
            return 1;
        } else if((p & 1) == 1) {
            return (x * binaryPower((x * x) % mod, p / 2)) % mod;
        } else {
            return binaryPower((x * x) % mod, p / 2) % mod;
        }
    }

    private long combMod(int n, int p) {
        return (((modFactorial[n] * invModFactorial[p]) % mod) * invModFactorial[n - p]) % mod;
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
    public static void write(int line)
    {
        System.out.println(line);
    }
}