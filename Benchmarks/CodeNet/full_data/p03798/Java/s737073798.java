import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String s = sc.next();
        boolean[] isO = new boolean[N];
        for (int i = 0; i < N; i++) {
            isO[i] = s.charAt(i) == 'o';
        }
        boolean[] first = {true, true, false, false};
        boolean[] second = {true, false, true, false};
        for (int i = 0; i < 4; i++) {
            boolean[] isS = new boolean[N];
            isS[0] = first[i];
            isS[1] = first[i];
            for (int j = 2; j < N; j++) {
                boolean tmp = isS[j - 1] ^ isO[j - 1];
                if (isS[j - 2]) {
                    tmp = !tmp;
                }
                isS[j] = tmp;
            }
            boolean tmp = isS[N - 1] ^ isO[N - 1];
            if (isS[N - 2]) {
                tmp = !tmp;
            }
            if (isS[0] == tmp) {
                for (int j = 0; j < N; j++) {
                    System.out.print(isS[j] ? 'S' : 'W');
                }
                System.out.println();
                return;
            }
        }
        System.out.println(-1);
    }
}
