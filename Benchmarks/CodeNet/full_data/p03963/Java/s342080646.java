import java.util.Scanner;

/**
 * Created by Seiya on 2016/10/16.
 */
public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();
        long ans = K;

        for(int i = 1; i < N; i++){
            ans *= K - 1;
        }

        System.out.println(ans);
    }



}
