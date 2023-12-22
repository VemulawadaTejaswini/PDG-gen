import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int N;
        String S;

        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
            S = sc.next();
        }
        char[] ch = S.toCharArray();
        int[] arr = new int[ch.length];
        for (int i = 0; i < ch.length; i++) {
            arr[i] = ch[i] - 48;
        }
        int result = 0;
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    int target = 0;
                    for (; target < arr.length; target++) {
                        if (arr[target] == i) {
                            target++;
                            break;
                        }
                    }
                    for (; target < arr.length; target++) {
                        if (arr[target] == j) {
                            target++;
                            break;
                        }
                    }
                    for (; target < arr.length; target++) {
                        if (arr[target] == k) {
                            result++;
                            break;
                        }
                    }
                }
            }
        }


        System.out.println(result);
    }
}
