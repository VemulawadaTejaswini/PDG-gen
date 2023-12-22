import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] ans = new int[N];
        int[] pena = new int[N];

        for(int i = 0; i < M; i++) {
            int pi = scanner.nextInt() - 1;
            String si = scanner.next();
            if(ans[pi] == 0) {
                if (si.equals("WA")) {
                    pena[pi]++;
                } else {
                    ans[pi] = 1;
                }
            }
        }

        int totalAns = 0;
        int totalPena = 0;
        for(int i = 0; i < N; i++) {
            if(ans[i] == 1) {
                totalAns++;
                totalPena += pena[i];
            }
        }

        System.out.println(totalAns);
        System.out.println(totalPena);
    }
}