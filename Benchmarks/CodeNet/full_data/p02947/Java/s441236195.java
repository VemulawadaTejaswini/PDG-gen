import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            String[] arrS = sc.next().split("");
            Arrays.sort(arrS);
            s[i] = String.join("", arrS);
        }

        int result = 0;
        for (int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++) {
                if (s[i].equals(s[j])) {
                    result++;
                }
            }
        }

        System.out.println(result);
    }
}
