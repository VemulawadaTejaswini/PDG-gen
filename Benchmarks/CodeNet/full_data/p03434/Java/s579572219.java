import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        boolean turn = true;
        int Alice= 0;
        int Bob = 0;
        int tmp = 0;
        for(int i = 0; i<N;i++){
            A[i] = Integer.parseInt(br.readLine());
        }
        for(int j = 0;j<N;j++) {
            for (int i = 0; i < N; i++) {
                if (tmp < A[i]) {
                    tmp = A[i];
                }
            }
            if (turn) {
                Alice += tmp;
                for (int i = 0; i < N; i++) {
                    if (tmp == A[i]) {
                        A[i] = 0;
                        tmp = 0;
                        turn = false;
                        break;
                    }
                }
            } else {
                Bob += tmp;
                for (int i = 0; i < N; i++) {
                    if (tmp == A[i]) {
                        A[i] = 0;
                        tmp = 0;
                        turn = true;
                        break;
                    }
                }
            }
        }
        System.out.println(Alice-Bob);
    }
}
