import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] a = new int [10000];
        int count = 0;
        for (int i = 0 ; i < N ; i++) {
            int a_i = sc.nextInt();
            if (a_i <= 10000) {
                a[a_i - 1]++;
            } else {
                //10000より大きいのは論外なので取り除く対象
                count++;
            }
        }
        //1~Nまでの数字が何個あるかを調べる
        //それぞれについて、少ないときは全部削る。多いときはあまりだけ削る。O(N)
        for (int i = 0 ; i < 10000 ; i++ ) {
            if (a[i] < i + 1) {
                count += a[i];
            } else if (a[i] > i + 1) {
                count += a[i] - (i + 1);
            }
        }
        System.out.println(count);

    }

}