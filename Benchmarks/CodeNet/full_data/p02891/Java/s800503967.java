import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        char[] S = scanner.next().toCharArray();
        long K = scanner.nextLong();

        long count = 0;
        for(int i = 1; i < S.length; i++) {
            if(S[i-1] == S[i] ) {
                count++;
                S[i] = '_';
            }
        }
        long edge = 0;
        if(S[0] == S[S.length-1]) edge = 1;

        long ans = (count * K) + (edge * (K - 1));

        System.out.println(ans);
    }
}