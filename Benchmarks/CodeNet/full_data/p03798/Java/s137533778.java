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
            isS[1] = second[i];
            for (int j = 2; j < N; j++) {
                boolean tmp = isS[j - 1] ^ isO[j - 1];
                if (isS[j - 2]) {
                    tmp = !tmp;
                }
                isS[j] = tmp;
            }
            boolean tmp1 = isS[N - 1] ^ isO[N - 1];
            if (isS[N - 2]) {
                tmp1 = !tmp1;
            }
            boolean tmp2 = isS[0] ^ isO[0];
            if (isS[N - 1]) {
                tmp2 = !tmp2;
            }
            if (isS[0] == tmp1 && isS[1] == tmp2) {
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
