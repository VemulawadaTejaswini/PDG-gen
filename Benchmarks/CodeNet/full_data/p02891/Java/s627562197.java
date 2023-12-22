import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner scan = new Scanner(is);
        String S = scan.next();
        long K = scan.nextLong();
        char sChar[] = S.toCharArray();

        char prevChar = sChar[0];
        long count = 0;
        long tempCount = 1;
        long tempFirstGpCount = 0;
        boolean lastChanged = false;
        boolean isAllSame = true;
        for(int i = 1; i < sChar.length; i++) {
            if (prevChar == sChar[i]) {
                tempCount++;
                if (i == sChar.length - 1) {
                    if((tempCount) % 2 == 0)
                        lastChanged = true;
                    count += Math.floor((tempCount)/2.0);
                }
            }
            else {
                if(isAllSame) {//最初の集団
                    tempFirstGpCount = tempCount;
                }
                isAllSame = false;
                prevChar = sChar[i];
                count += Math.floor((tempCount)/2.0);
                tempCount = 1;
            }
        }
        if(sChar.length != 1) {
            if (!lastChanged && sChar[0] == sChar[sChar.length - 1]) {//最初と最後が一緒
                if(isAllSame) {
                    if(K % 2 == 0) {
                        count = (count+1) * 2 -1;
                        os.println(count * (K/2));
                    } else {
                        long originCount = count;
                        count = (count+1) * 2 -1;
                        os.println(count * Double.valueOf(Math.floor(K/2.0)).intValue() + originCount);
                    }
                } else {
                    if(tempFirstGpCount % 2 == 1) {
                        count++;
                        os.println(count * K - 1);
                    } else {
                        os.println(count * K);
                    }
                }
            }
            else
                os.println(count * K);
        }
        else
            os.println(Double.valueOf(Math.floor(K/2.0)).intValue());
    }
}