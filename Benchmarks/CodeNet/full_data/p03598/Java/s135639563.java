import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {

    int[] inputArray;

    public static void main(String[] args) throws IOException {
        new Main().run();
    }

    void run() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        inputArray = new int[N];

        for(int i=0; i<N; i++){
            inputArray[i] = sc.nextInt();
        }

        int sum = 0;

        for(int i=0; i<N; i++){
            int num = inputArray[i];
            int ans = Math.min(Math.abs(num-K)*2, Math.abs(num-0)*2);

            sum += ans;
        }

        System.out.println(sum);
    }

}