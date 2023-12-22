import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        if (A==C || B==D) { System.out.println(0); return; }

        int y = Math.abs(D-B);
        int x = Math.abs(C-A);
        int a = x; int b = y;
        if (y < x) { a=y; b=x; }

        int ans = b/a;
        if (b % a != 0) { ans++; }
        ans *= a;
        System.out.println("" + ans);
    }
}
