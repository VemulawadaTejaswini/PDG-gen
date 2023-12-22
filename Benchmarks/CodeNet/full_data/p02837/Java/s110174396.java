import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static final int HONEST = 1, DISHONEST = 0;
    int N;
    int[][][] A;

    public Main() {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        A = new int[N][][];

        for (int i = 0; i < N; i++) {
            int J = scanner.nextInt();
            A[i] = new int[J][2];

            for (int j = 0; j < J; j++) {
                A[i][j][0] = scanner.nextInt() - 1;
                A[i][j][1] = scanner.nextInt();
            }
        }

        int[] B = new int[N];
        Arrays.fill(B, DISHONEST);

        System.out.println(search(B, 0, 0));
    }

    int search(int[] B, int num, int index){
        if (index == N){

            for (int i = 0; i < N; i++) {
                int L = A[i].length;
                if(B[i] == HONEST){
                    for (int j = 0; j < L; j++) {
                        if(B[A[i][j][0]] != A[i][j][1]){
                            return -1;
                        }
                    }
                } else {
                    int T = 0;
                    for (int j = 0; j < L; j++) {
                        if(B[A[i][j][0]] == A[i][j][1]){
                            T++;
                        }
                    }

                    if (T == N) return -1;
                }
            }

            return num;
        }

        B[index] = HONEST;
        int R = search(B,num+1,index+1);
        B[index] = DISHONEST;
        R = Math.max(R, search(B,num,index+1));

        return R;
    }

    public static void main(String[] args) {
        new Main();
    }
}
