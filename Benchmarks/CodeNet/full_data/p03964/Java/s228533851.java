import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, T, A,num_T=0,num_A=0,x,y,z=0,w=0;
        N = sc.nextInt();
            num_T=sc.nextInt();
            num_A=sc.nextInt();
            for (int a = 1; a < N; a++) {
                T = sc.nextInt();
                A = sc.nextInt();
                if (T == 1 && A == 1) {
                    if (num_A > num_T) num_T = num_A;
                    else num_A = num_T;
                } else {
                    y = A - (num_A % A);
                    x = ((num_A + y) / A) * T - num_T;
                    num_T = num_T + x;
                    num_A = num_A + y;
                }
            }
        int num = num_T + num_A;
        System.out.println(num);

    }
}
