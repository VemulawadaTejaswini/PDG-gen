import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int a = Character.getNumericValue(s.charAt(0));
        int b = Character.getNumericValue(s.charAt(1));
        int c = Character.getNumericValue(s.charAt(2));
        int d = Character.getNumericValue(s.charAt(3));
        char[] kigou = {'+', '-'};
        int sum = 0;
        String result = "";

        for (char aKigou : kigou) {
            for (char aKigou1 : kigou) {
                for (char aKigou2 : kigou) {

                    if (aKigou == '+') {
                        sum = a + b;

                    } else {
                        sum = a - b;
                    }

                    if (aKigou1 == '+') {
                        sum = sum + c;

                    } else {
                        sum = sum - c;
                    }

                    if (aKigou2 == '+') {
                        sum = sum + d;

                    } else {
                        sum = sum - d;
                    }

                    if (sum == 7) {
                        result = String.valueOf(a) + aKigou + String.valueOf(b) + aKigou1 + String.valueOf(c) + aKigou2 + String.valueOf(d);
                        break;
                    }

                }
                if (sum == 7) {
                    break;
                }
            }
            if (sum == 7) {
                break;
            }
        }

        result += "=7";
        System.out.println(result);

    }
}