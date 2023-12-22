import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = Integer.parseInt(s.next());
        int K = Integer.parseInt(s.next());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            int p = Integer.parseInt(s.next());
            arr[i] = p;
        }
        int sum = 0;
        int tmp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i < K) {
                sum += arr[i];
                tmp += arr[i];
                continue;
            }
            tmp += arr[i];
            tmp -= arr[i - K];
            if (sum < tmp) {
                sum = tmp;
            } 
        }
        System.out.println((sum + K) / (double) 2.0);
    }
}