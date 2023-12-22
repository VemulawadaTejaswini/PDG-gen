import java.util.Scanner;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int N, D, X, a, day, ans;
        N = Integer.parseInt(sc.next());
        D = Integer.parseInt(sc.next());
        X = Integer.parseInt(sc.next());
        ans = 0;
        for (int i = 0; i < N; i++){
            a = Integer.parseInt(sc.next());
            day = 1;
            while (day <= D){
                ans += 1;
                day += a;
            }
        }
        out.println(ans + X);
        out.flush();
    }
}