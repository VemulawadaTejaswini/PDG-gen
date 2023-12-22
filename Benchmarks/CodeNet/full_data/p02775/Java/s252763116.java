import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nStr = in.next();
        int len = nStr.length();
        StringBuilder nonFiveMap = new StringBuilder();
        int prevNon5Digit = 0;
        for(int i=0; i<len; i++) {
            int requiredDigit = Integer.parseInt(nStr.substring(i, i+1));
            if(requiredDigit!=5) {
                prevNon5Digit = requiredDigit;
            }
            nonFiveMap.append(prevNon5Digit);
        }

        long c = 0;
        boolean moveUp = false;
        for(int i=len-1; i>=0; i--) {
            int requiredDigit = Integer.parseInt(nStr.substring(i, i+1));
            if(moveUp) {
                requiredDigit++;
            }

            prevNon5Digit = Integer.parseInt(nonFiveMap.substring(i, i+1));
            if(requiredDigit<5 || (requiredDigit==5 && prevNon5Digit<5)) {
                c+=requiredDigit;
                moveUp = false;
            }
            else {
                c+=(10-requiredDigit);
                moveUp = true;
            }
        }
        if(moveUp) {
            c++;
        }
        System.out.println(c);
    }
}
