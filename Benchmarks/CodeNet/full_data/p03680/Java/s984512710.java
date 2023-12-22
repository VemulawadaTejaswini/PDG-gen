import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int[] a = new int[N];
        boolean[] d = new boolean[N];
        for (int i = 0; i < N; i++) {
            a[i] = scan.nextInt()-1;
        }
        int current = 0;
        int answer = 0;
        while(current != 1 && !d[current]) {
            d[current] = true;
            current = a[current];
            answer += 1;
        }
        if (current == 1) {
            System.out.println(answer);
        } else {
            System.out.println(-1);
        }
    }
}
