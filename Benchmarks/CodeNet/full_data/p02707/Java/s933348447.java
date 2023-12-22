import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] arr = new int[N];
        for (int i = 1; i < N; i++) {
            arr[in.nextInt() - 1]++;
        }
        for (int i = 0; i < N; i++) {
            System.out.println(arr[i]);
        }
    }
}