import java.util.Scanner;

public class Main {
    private static Scanner in;

    private static int n;
    private static int[] h;

    public static void main(String[] args) {
        in = new Scanner(System.in);
        
        n = in.nextInt();
        h = new int[n];

        for(int i=0; i<n; i++) h[i] = in.nextInt();

        System.out.println(solve(0));


    }

    public static int solve(int i) {
        if (i==n-1) return 0;

        return Math.min(Math.abs(h[i+1]-h[i])+solve(i+1), i+2<n?Math.abs(h[i+2]-h[i]+solve(i+2)):(int)1e9);

    }

}