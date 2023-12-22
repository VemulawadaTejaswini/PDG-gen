import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        if(M == 0) {
            System.out.println(0);
            return;
        }
//        int[] s = new int[M];
//        int[] c = new int[M];
        int[] k = new int[N];
        for(int i = 0; i < N; i++) {
            k[i] = -1;
        }
        int ret = 0;
        for(int i = 0; i < M; i++) {
            int s = scanner.nextInt() - 1;
            int c = scanner.nextInt();
            if(k[s] != -1 && k[s] != c ) {
                ret = -1;
            }
            if(N > 1 && s == 0 && c == 0) {
                ret = -1;
            }
            k[s] = c;
        }
        if(ret == -1) {
            System.out.println(ret);
            return;
        }

        boolean flg = false;
        for(int i = 0; i < N; i++) {
            if(i == 0 && k[i] == -1 && k[1] == 0) {
                System.out.print(1);
                flg = true;
            } else if(k[i] == -1) {
                if(flg) {
                    System.out.print(0);
                }
            } else{
                System.out.print(k[i]);
                flg = true;
            }
        }
    }




}