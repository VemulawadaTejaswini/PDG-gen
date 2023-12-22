import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, T, A,num_T=0,num_A=0,x,y,z=0,w=0;
        N = sc.nextInt();
            num_T=sc.nextInt();
            num_A=sc.nextInt();
            int num_one=0;
            if(num_T==1&&num_A==1)num_one++;
        for (int a = 1; a < N; a++) {
            T = sc.nextInt();
            A = sc.nextInt();
            if(T==1&&A==1) num_one++;
            else num_one =0;
            if(num_one<2) {
                if(A-num_A<0) {
                    x = 2 * T - num_T;
                    y = 2 * A - num_A;
                    num_T = num_T + x;
                    num_A = num_A + y;
                }
                else{
                    x = T - num_T;
                    y = A - num_A;
                    num_T = num_T + x;
                    num_A = num_A + y;

                }
            }
        }
        int num=num_T+num_A;
        System.out.println(num);
    }
}
