import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int D = Math.abs(X - sc.nextInt());
        for(int i = 1; i < N; i++){
            int diff = Math.abs(X - sc.nextInt());
            D = gcd(diff, D);
        }
        System.out.println(D);
        sc.close();
    }

    private static int gcd(int x, int y) {

        if(x == 0 || y == 0) return 0;
        int t;
        if(y > x){
            t = y;
            y = x;
            x = t;
        }
        while((t = x % y) != 0 ){
            x = y;
            y = t;
        }
        return y;
    }

}
