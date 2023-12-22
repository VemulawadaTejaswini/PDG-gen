import java.io.BufferedInputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedInputStream(System.in));
        int N = scan.nextInt();
        int K = scan.nextInt();
        int[] arr = new int[N];
        for (int i=0;i<N;i++) arr[i] = scan.nextInt();
        Task tsk = new Task();
        System.out.println(tsk.solve(K-1, arr));
    }

    static class Task{
        public int solve(int k, int[] arr){
            int min = Integer.MAX_VALUE;
            for (int i=0;i+k<arr.length;i++) {
                int time = Math.min(Math.abs(arr[i]), Math.abs(arr[i+k]))
                        + Math.abs(arr[i] - arr[i+k]);
                min = Math.min(min, time);
            }
            return min;
        }
    }
}
