import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        float count = 0;
        float tmp01 = 0;

        if(K < N){
            tmp01 = (1 / N) * (N - K + 1);
        }

        // number
        for(int i=1; i <= N; i++){
            float tmp02 = 1f;

            for(int n=i; n < K; n=n*2){
                tmp02 = tmp02 * 0.5f;
            }
            count = count + tmp02 / N;
        }
        count = count + tmp01;
        System.out.print(count);
    }
}