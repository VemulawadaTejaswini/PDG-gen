import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        int[] sA = new int[N];
        int[] sB = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextInt();
            sA[i] = A[i];
        }
        for (int i = 0; i < N; i++) {
            B[i] = scan.nextInt();
            sB[i] = B[i];
        }
        Arrays.sort(sA);
        Arrays.sort(sB);
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (sA[i] <= sB[i]) {
                count +=1;
            }
        }
        if (count < N) {
            System.out.println("No");
            return;
        }
        int max_A = Arrays.stream(B).max().getAsInt();
        int max_B = Arrays.stream(B).max().getAsInt();
        if (max_B < max_A) {
            System.out.println("No");
            return;
        }
        System.out.println("Yes");
    }
}
