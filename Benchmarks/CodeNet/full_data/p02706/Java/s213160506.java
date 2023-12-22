import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int M = input.nextInt();
        int[] A = new int[M];
        for (int i = 0; i < M; i++){
            A[i] = input.nextInt();
        }
        int ans = N;
        for (int i = 0; i < M; i++){
            ans -= A[i];
        }
        System.out.println(Math.max(-1,ans));
    }
}