import java.util.*;
public class Main {
    public static void main(String[] argas){
        Scanner sc = new Scanner(System.in);
        int N,sum_price=0;
        N = sc.nextInt();
        int [] A = new int[N+2];
        int [] price = new int[N];
        for(int a=0;a<N+2;a++){
            if(a==0) A[a] =0;
            else if(a==N+1) A[a] =0;
            else A[a] = sc.nextInt();
        }

        for(int a=1;a<N+1;a++){
            for(int b=0;b<N+1;b++){
                if(a==b) price[a-1]+=0;
                else if(a!=b+1) price[a-1] += Math.abs(A[b]-A[b+1]);
                else price[a-1] += Math.abs(A[b]-A[b+2]);
            }
        }
        for(int a=0;a<N;a++){
            System.out.println(price[a]);
        }
    }
}
