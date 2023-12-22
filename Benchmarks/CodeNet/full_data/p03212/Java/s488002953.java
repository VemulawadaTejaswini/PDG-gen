
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String [] args) {
        final Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] kinds = new int[10];
        kinds[3] = 6;
        kinds[4] = 36;
        kinds[5] = 150;
        kinds[6] = 540;
        kinds[7] = 1806;
        kinds[8] = 5796;

        int length = 0;
        if (n < 357) {
            System.out.println(0);
            return;
        }
        String str = String.valueOf(n);
        length = str.length();
     //   System.out.println("length: " + length);

        int sum = 0;
        for (int i = 0 ; i <= length - 1; ++i) {
            sum += kinds[i];
        }
      //  System.out.println("sum: " + sum);
        Set<String> result = new HashSet<>();
        result.add("");

        sum += calculate(str, false, 0, result);
        System.out.println(sum);
    }

    public static int calculate(String str, boolean isSmaller, int pos, Set<String> results) {
    //    System.out.println("pos: " + pos);

        if (pos == str.length()) {
            int kinds = 0;
            for (String result : results) {
      //          System.out.println("result: " + result);
                if (result.contains("3") && result.contains("5") && result.contains("7")) {
                    ++kinds;
                }
            }
            return kinds;
        }

        if (isSmaller) {
            Set<String> newResults = new HashSet<>();
            for (String result : results) {
                newResults.add(result + '3');
                newResults.add(result + '5');
                newResults.add(result + '7');
            }
            return calculate(str, true, pos + 1, newResults);
        } else {
            if (str.charAt(pos) < '3') {
                return 0;
            }
            else if (str.charAt(pos) <= '4') {
                Set<String> newResult = new HashSet<>();
                for (String result : results) {
                    newResult.add(result + '3');
                }
                return calculate(str, str.charAt(pos) > '3', pos + 1, newResult);
            } else if (str.charAt(pos) <= '6') {
                Set<String> newResults1 = new HashSet<>();
                for (String result : results) {
                    newResults1.add(result + "3");
                }
                int firstSum = calculate(str, str.charAt(pos) > '3', pos + 1, newResults1);

                Set<String> newResults2 = new HashSet<>();
                for (String result : results) {
                    newResults2.add(result + "5");
                }
                int secondSum = calculate(str, str.charAt(pos) > '5', pos + 1, newResults2);
                return firstSum + secondSum;
            } else {
                Set<String> newResults1 = new HashSet<>();
                for (String result : results) {
                    newResults1.add(result + "3");
                    newResults1.add(result + "5");
                }
                int firstSum = calculate(str, true, pos + 1, newResults1);

                Set<String> newResults2 = new HashSet<>();
                for (String result : results) {
                    newResults2.add(result + "7");
                }
                int secondSum = calculate(str, str.charAt(pos) > '7', pos + 1, newResults2);
                return firstSum + secondSum;
            }
        }
    }
}
