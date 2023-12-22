import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int[] P = new int[N];
        for (int i = 0; i < N; i++) {
            P[i] = sc.nextInt();
        }
        int[] wake = new int[3];
        for (int i = 0; i < N; i++) {
            if (P[i] <= A) wake[0]++;
            else if (P[i] <= B) wake[1]++;
            else wake[2]++;
        }
        System.out.println(Math.min(Math.min(wake[0], wake[1]), wake[2]));
        sc.close();
    }
}