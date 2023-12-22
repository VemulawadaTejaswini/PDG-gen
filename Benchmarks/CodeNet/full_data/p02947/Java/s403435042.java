import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] sCode = new int[n];
        int result = 0;
        for (int i = 0; i < n; i++) {
            String[] s = sc.next().split("");
            int code = 0;
            for (int j= 0; j < s.length; j++){
                code += s[j].charAt(0);
            }
            for (int j = 0; j < i; j++) {
                if (sCode[j] == code) {
                    result++;
                }
            }
            sCode[i] = code;
        }

        System.out.println(result);
    }
}
