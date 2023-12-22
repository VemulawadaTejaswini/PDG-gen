import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // 入力受取
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String line1 = input.readLine();

        int N = Integer.parseInt(line1);
        Integer[] A = new Integer[N];
        for(int i=0;i<N;i++) {
            A[i] = Integer.parseInt(input.readLine());
        }

        Integer[] B = new Integer[N];
        System.arraycopy(A,0,B,0,A.length);
        Arrays.sort(B, Collections.reverseOrder());

        for(int i=0;i<N;i++) {
            // 1番目に大きい数と同じなら2番めに大きい数を出力する
            if(A[i]==B[0]) {
                System.out.println(B[1]);
            } else {
                System.out.println(B[0]);
            }
        }

    }
}
