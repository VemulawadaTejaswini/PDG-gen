import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int K = s.nextInt();
        int count = 0;
        if(K == 0){
            System.out.println(N * N);
            return;
        }

        for (int a = K; a <= N; a++){
            count += N - a;
            for (int b = a + 1; b <= N - a; b++) {
                if (a % b >= K) {
                    count++;
                }

            }
        }
        System.out.println(count);
    }
}
