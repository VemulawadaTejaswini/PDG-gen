import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line;

        int A = sc.nextInt();
        int B = sc.nextInt();
        int M = sc.nextInt();
        int[] a_list = new int[A];
        int[] b_list = new int[B];

        for(int i = 0; i < a_list.length; i++) {
            a_list[i] = sc.nextInt();
        }
        for(int i = 0; i < b_list.length; i++) {
            b_list[i] = sc.nextInt();
        }

        int a = a_list[0];
        int b = b_list[0];
        int m = 0;
        int ret = a + b;

        for(int i = 0; i < M; i++) {
            int xa = sc.nextInt();
            int xb = sc.nextInt();
            int xm = sc.nextInt();
            int x_ret = a_list[xa - 1] + b_list[xb - 1] - xm;
            if(ret > x_ret) {
                ret = x_ret;
            }
        }

        System.out.println(ret);
    }
}
