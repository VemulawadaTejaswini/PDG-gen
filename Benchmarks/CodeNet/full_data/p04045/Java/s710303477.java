import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        boolean[] isHate = new boolean[10];
        Arrays.fill(isHate, false);
        for (int i = 0; i < k; i++) {
            isHate[sc.nextInt()] = true;
        }

        long num = n;
        int digitNum = Long.toString(num).length();
        for (int i = 0; i < digitNum; i++) {
            int digit = getDigit(num, i);
            if(isHate[digit]) {
                for(int j = 9; j > digit; j--) {
                    if(!isHate[j]) {
                        num -= Math.pow(10, digitNum - i - 1) * digit;
                        num += Math.pow(10, digitNum - i - 1) * j;
                        break;
                    }
                }
            }
        }

        System.out.println(num);
    }

    private static int getDigit(long num, int index) {
        return Integer.parseInt(String.valueOf(Long.toString(num).charAt(index)));
    }
}
