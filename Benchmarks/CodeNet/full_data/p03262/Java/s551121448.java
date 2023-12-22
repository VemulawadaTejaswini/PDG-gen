import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N, X;
        N = scan.nextInt();
        X = scan.nextInt();
        int[] x = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = scan.nextInt();
        }
        int [] dif = new int[N + 1];
        for (int i = 0; i < N; i++) {
            dif[i] = Math.abs(x[i] - X);
        }
        dif[N] = 1;
        Arrays.sort(dif);
        
        // for (int i = N; i >= 0; i--) {
        //     System.out.println(dif[i]);
        // }
        
        for (int i = N; i >= 0; i--) {
            if (check(dif, dif[i])) {
                System.out.println(dif[i]);
                break;
            }
        }
    }
    
    public static boolean check(int[] array, int num) {
        for (int i = array.length - 1; i > 0; i--) {
            if (array[i] % num != 0) {
                return false;
            }
        }
        return true;
    }
}
