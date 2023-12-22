import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int D = in.nextInt();
        int N = in.nextInt();
        double d = Math.pow(100,D);
        int a = (int)d;
        int ans = a * N;
        if(ans == 100)
            ans += (a * 1);
        System.out.println(ans);
    }
}