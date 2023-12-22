package atcoder;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        //リュカ数を求める
        long L[] = new long[N+1];
        for (int i = 0; i <= N; i++) {
            if (i == 0) {
                L[i] = 2;
            } else if (i == 1) {
                L[i] = 1;
            } else {
                L[i] = L[i-1] + L[i-2];
            }
            //System.out.println("L[" + i + "]：" + L[i]);
        }

        //System.out.println(N + "番目のリュカ数：" + L[N]);
        System.out.println(L[N]);
    }

}