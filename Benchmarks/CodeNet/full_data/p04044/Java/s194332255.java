import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        int L = cin.nextInt();
        String[] S = new String[N];
        for (int i = 0; i < N; i++) {
            S[i] = cin.next().substring(0, L);
        }

        Arrays.sort(S);

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < N; i++) {
            sb.append(S[i]);
        }

        System.out.println(sb.toString());
    }
}
