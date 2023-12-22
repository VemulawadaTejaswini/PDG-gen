import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder s = new StringBuilder(scan.next());
        Pattern ptn = Pattern.compile("(A+)((BC)+)");
        long cnt = 0;
        while (true) {
            boolean isModified = false;
            Matcher matcher = ptn.matcher(s);
            while (matcher.find()) {
                isModified = true;
                int aStart = matcher.start(1);
                int aEnd = matcher.end(1);
                int bcStart = matcher.start(2);
                int bcEnd = matcher.end(2);
                int aNum = aEnd - aStart;
                int bcNum = (bcEnd - bcStart)/2;
                cnt += aNum * bcNum;
                for (int i = aStart; i < bcEnd;) {
                    if (bcNum > 0) {
                        s.setCharAt(i, 'B');
                        s.setCharAt(i+1, 'C');
                        i+=2;
                        bcNum--;
                    } else {
                        s.setCharAt(i, 'A');
                        i+=1;
                    }
                }
            }
            if (!isModified) break;
        }
        System.out.println(cnt);
    }
}
