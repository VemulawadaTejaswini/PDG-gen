import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] hates = new int[k];
        for (int i = 0; i < k; i++) {
            hates[i] = sc.nextInt();
        }

        long num = n;
        int digit;
        while((digit = isContainsHateNumber(hates, num)) >= 0) {
            num += num * getNextMultipleNumber(hates, digit);
        }

        System.out.println(num);
    }

    private static int isContainsHateNumber(int[] hates, long num) {
        int digitNum = Long.toString(num).length();
        for (int i = 0; i < digitNum; i++) {
            int digit = Integer.parseInt(String.valueOf(Long.toString(num).charAt(i)));
            for (int hate : hates) {
                if(digit == hate) {
                    return digit;
                }
            }
        }
        return -1;
    }

    private static int getNextMultipleNumber(int[] hates, int digit) {
        for (int i = 2; i < 10; i++) {
            boolean isOk = true;
            for (int j = 0; j < hates.length; j++) {
                if(hates[j] % (i * digit) == 0) {
                    isOk = false;
                    break;
                }
            }
            if(isOk) return i;
        }
        return 1;
    }
}
