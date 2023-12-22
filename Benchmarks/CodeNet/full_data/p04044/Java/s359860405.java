import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] NL = sc.nextLine().split(" ");
        int n = Integer.parseInt(NL[0]);
        int l = Integer.parseInt(NL[1]);
        String[] S = new String[n];
        for (int i = 0; i < n; i++) {
            S[i] = sc.nextLine();
        }

        Arrays.sort(S);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(S[i]);
        }

        System.out.println(sb.toString());
    }
}
