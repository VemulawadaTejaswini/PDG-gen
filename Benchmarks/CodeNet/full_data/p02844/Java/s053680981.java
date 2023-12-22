import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static final int PIN_LENGTH = 3;

    public static void main(String[] args) {
        int n = sc.nextInt();
        String s = sc.next();

        long ans = 0;
        for(int i = 0; i <= 999; ++i) {
            char[] digits = generatePinForm(i).toCharArray();
            String regex = generateRegex(digits);
            if(s.matches(regex)) ++ans;
        }

        System.out.println(ans);        
    }

    static String generatePinForm(int num) {
        StringBuilder sb = new StringBuilder();
        String numStr = String.valueOf(num);

        int numOfZero = PIN_LENGTH - numStr.length();
        for(int i = 0; i < numOfZero; ++i) {
            sb.append(0);
        }

        sb.append(numStr);
        return sb.toString();
    }

    static String generateRegex(char[] digits) {
        StringBuilder sb = new StringBuilder();
        sb.append(".*");
        sb.append(digits[0]);
        sb.append(".*");
        sb.append(digits[1]);
        sb.append(".*");
        sb.append(digits[2]);
        sb.append(".*");
        return sb.toString();
    }
}
