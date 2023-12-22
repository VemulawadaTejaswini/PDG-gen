import java.util.*;

class Main{
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        sc.close();

        int max_coin = 1;
        while((2 << max_coin)/2 < K){
            max_coin++;
        }
        int bunbo = 2 << (max_coin-1);
        int result_tmp = 0;
        for(int i=1;i<=N;i++){
            int count = 1;
            while(i * (2 << count)/2 < K){
                count++;
            }
            result_tmp += (2 << (max_coin-count))/2;
        }
        double result = (double)result_tmp / ((double)(2<<(max_coin-1))*(double)N);
        System.out.println(result);
    }
}