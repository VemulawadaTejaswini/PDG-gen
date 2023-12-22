import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        String S = scan.next();
        char[] d = S.toCharArray();
        int[] E = new int[N+2];
        E[0] = 0;
        for (int i = 0; i < N; i++) {
            E[i+1] = E[i] + (d[i] == 'W' ? 1 : 0);
        }
        E[N+1] = E[N];
        int[] W = new int[N+2];
        W[N] = 0;
        for (int i = N-1; 0 <= i; i--) {
            W[i] = W[i+1] + (d[i] == 'E' ? 1 : 0);
        }
        W[0] = W[1];
        int answer = Integer.MAX_VALUE;
        for (int i = 1; i <= N; i++) {
            answer = Math.min(answer, E[i-1]+W[i+1]);
        }
        System.out.println(answer);
    }
}
