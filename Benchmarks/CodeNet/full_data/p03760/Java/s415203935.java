import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static final long MAX = 10000000000l;
    public static void main(String[] args) {
        try {
            // 標準入力
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String o = br.readLine();
            String e = br.readLine();
            boolean oFlag = true;
            boolean endFlag = false;
            int oLength = o.length();
            int eLength = e.length();
            int oCount = 0;
            int eCount = 0;
            while (true) {
                if (oFlag) {
                    if (oLength < oCount + 1) {
                        if (endFlag) {
                            break;
                        }
                        endFlag = true;
                        continue;
                    }
                    System.out.print(o.substring(oCount, oCount + 1));
                    oCount++;
                    oFlag = false;
                } else {
                    if (eLength < eCount + 1) {
                        if (endFlag) {
                            break;
                        }
                        endFlag = true;
                        continue;
                    }
                    System.out.print(e.substring(eCount, eCount + 1));
                    eCount++;
                    oFlag = true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int digit(long num) {
        return String.valueOf(num).length();
    }
}