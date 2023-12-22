import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int [] F = new int[N];
        long [][] P = new long[N][10];
        int [] num_shop = new int[N];
        int num_max = 0;
        int sum=0;
        for(int a=0;a<N;a++){
            F[a]=0;
            for(int b=0;b<10;b++){
                int num = sc.nextInt();
                if(num==1)F[a]++;
            }
        }
        for(int a=0;a<N;a++){
            long max=0;
            int num_b=0;
            for(int b=0;b<F[a]+1;b++){
                P[a][b]=sc.nextInt();
                if(max<=P[a][b]){
                    max=P[a][b];
                    num_b=b;
                }
            }
            num_shop[a]=num_b;
            num_max++;
        }
        if(num_max!=10) {
            for (int a = 0; a < N; a++) {
                sum += P[a][num_shop[a]];
            }
            System.out.println(sum);
        }
    }
}