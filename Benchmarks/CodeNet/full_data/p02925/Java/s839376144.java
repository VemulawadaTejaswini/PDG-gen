
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] A = new int[N][N-1];
        int[] index = new int[N];
        int[] addIndex = new int[N];
        int ans = 0;
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N - 1; j++) {
                A[i][j] = scanner.nextInt() - 1;
            }
        }

        while(!isFinish(index, addIndex,N-1)){
            addIndex = new int[N];
            boolean battle = false;
            for(int i = 0; i < N; i++){
                if(index[i]/2 >= N-1) continue;
                int target = A[i][index[i]/2];
                if(i == A[target][index[target]/2]) {
                    addIndex[i]++;
                    addIndex[target]++;
                    battle = true;
                }
            }
            if(!battle) {
                System.out.println(-1);
                return;
            }
            ans++;
        }


        System.out.println(ans);
    }

    private boolean isFinish(int[] index, int[] addIndex, int n) {
        boolean is = true;
        for(int i = 0; i < index.length; i++) {
            index[i] += addIndex[i];
            if(index[i] / 2 != n){
                is = false;
            }
        }
        return is;
    }
}