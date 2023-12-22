import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static final int PIN_LENGTH = 3;
    static int n = 0;
    static char[] s = null;

    public static void main(String[] args) {
        n = sc.nextInt();
        s = sc.next().toCharArray();

        long ans = 0;
        for(int i = 0; i <= 999; ++i) {
            char[] digits = generatePinForm(i);
            if(canMakeArgPin(digits)) ++ans;
        }

        System.out.println(ans);        
    }

    static char[] generatePinForm(int num) {
        StringBuilder sb = new StringBuilder();
        String numStr = String.valueOf(num);
        int numOfZero = PIN_LENGTH - numStr.length();
        for(int i = 0; i < numOfZero; ++i) {
            sb.append(0);
        }
        sb.append(numStr);
        return sb.toString().toCharArray();
    }

    static boolean canMakeArgPin(char[] digits) {
        int digitsIndex = 0;
        for(int i = 0; i < n; ++i) {
            if(s[i] == digits[digitsIndex]) ++digitsIndex;
            if(digitsIndex == PIN_LENGTH) return true;
        }
        return false;
    }
}
