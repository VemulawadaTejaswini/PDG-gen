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

        int a = 0;
        int aMin = 100000;
        int b = 0;
        int bMin = 100000;
        int m = 0;
        int ret = 0;

        for(int i = 0; i < a_list.length; i++) {
            if(aMin > a_list[i]) {
                aMin = a_list[i];
            }
        }
        for(int i = 0; i < b_list.length; i++) {
            if(bMin > b_list[i]) {
                bMin = b_list[i];
            }
        }
        ret = aMin + bMin;

        for(int i = 0; i < M; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            m = sc.nextInt();
            int x_ret = a_list[a - 1] + b_list[b - 1] - m;
            if(ret > x_ret) {
                ret = x_ret;
            }
        }

        System.out.println(ret);
    }
}
