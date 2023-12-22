import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        boolean movable = true;
        int t[] = new int[N+1];
        int x[] = new int[N+1];
        int y[] = new int[N+1];
        t[0] = 0;
        x[0] = 0;
        y[0] = 0;
        
        for (int i = 1; i <= N; i++) {

            t[i] = sc.nextInt();
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();

            if (t[i]%2 != (x[i]+y[i])%2) {
                movable = false;
            }

            if((t[i] - t[i-1]) < Math.abs(x[i] - x[i-1]) + Math.abs(y[i] - y[i-1])) {
                movable = false;
            }
        }
        System.out.println(movable ? "YES" : "NO");
    }
}