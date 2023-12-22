import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int N = sc.nextInt();
        int ans = 1;

        for (int i=0; i<D; i++) {
            ans *= 100;
        }

        if (N == 100) {
            N++;
        }

        ans *= N;

        System.out.println("" + ans);
    }
}
