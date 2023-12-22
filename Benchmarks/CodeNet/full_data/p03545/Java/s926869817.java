import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for(int i = 0; i < 8; i++) {
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < s.length(); j++) {
                sb.append(s.charAt(j));
                if(j == s.length()-1) break;
                if((1 & i >> j) == 1) {
                    sb.append("+");
                } else {
                    sb.append("-");
                }
            }
            int sum = 0;
            String expression = sb.toString();
            for(int k = 0; k < expression.length(); k++) {
                if (expression.charAt(k) == '+') {
                    sum += (expression.charAt(k+1) - '0');
                    k++;
                } else if (expression.charAt(k) == '-') {
                    sum -= (expression.charAt(k+1) - '0');
                    k++;
                } else {
                    sum += expression.charAt(k) - '0';
                }
            }
            if(sum == 7) {
                System.out.println(expression + "=7");
                return;
            }
        }
    }
}
