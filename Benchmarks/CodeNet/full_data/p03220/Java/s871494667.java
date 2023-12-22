import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int A = sc.nextInt();
        int index = 0;
        int diff = 1000000;
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for(int j = 0; j < N; j++) {
            double tmp = T - arr[j] * 0.006;
            if(diff > (A - tmp)) {
                diff = A - (int)tmp;
                index = j + 1;
            }
        }
        System.out.println(index);
    }
}
