import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static void resetAvailable(int[] available, int N) {
        for(int i = 0; i < N; i++) {
            available[i] = 1;
        }
    }

    static boolean isAllAvailable(int[] available, int N) {
        for(int i = 0; i < N; i++) {
            if (available[i] == 0)
                return false;
        }
        return true;
    }

    static boolean isAllDone(int pos[], int N) {
        for (int i = 0; i < N; i++) {
            if(pos[i] < N-1)
                return false;
        }
        return true;
    }

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner scan = new Scanner(is);
        int N = scan.nextInt();
        int available[] = new int[N];//使用可能なら1.　不可なら0
        int pos[] = new int[N];//全部完了したらN-1 N-1にはアクセス不可
        int value [][] = new int[N][N-1];
        resetAvailable(available, N);
        for(int i = 0; i < N; i++) {
            pos[i] = 0;
        }
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N - 1; j++) {
                value[i][j] = scan.nextInt() - 1;
            }
        }

        long firstTime = System.currentTimeMillis();


        int answer = 0;
        while(!isAllDone(pos, N)) {
            if(System.currentTimeMillis() - firstTime > 1800) {
                os.println(N * (N-1)/2);
                return;
            }

            for (int i = 0; i < N; i++) {
                if(available[i] == 0 || pos[i] == N-1)
                    continue;

                int enemy = value[i][pos[i]];
                if(value[enemy][pos[enemy]] == i && available[enemy] == 1){
                    available[i] = 0;
                    available[enemy] = 0;
                    pos[i] += 1;
                    pos[enemy] += 1;
                }
            }
            if (isAllAvailable(available, N)) {
                os.println("-1");
                return;
            } else {
                answer++;
                resetAvailable(available, N);
            }
        }
        os.println(answer);
    }
}