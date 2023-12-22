import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int X = Integer.parseInt(sc.next());

        int[] L = new int[N];
        for (int i = 0; i < N; i++) {
            L[i] = Integer.parseInt(sc.next());
        }

        int cnt = 1;
        int Dprevious = 0;
        for (int i = 0; i < N; i++) {
            Dprevious = Dprevious + L[i];
            if (Dprevious <= X) {
                cnt += 1;
            }else{
                break;
            }
        }
        System.out.println(cnt);
    }
}
