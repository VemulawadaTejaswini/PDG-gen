import java.util.*;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), K = sc.nextInt(), X = sc.nextInt(), Y = sc.nextInt();
        
        if (N > K) {
            System.out.println(K*X+(N-K)*Y);
        } else if(N <= K) {
            System.out.println(N*X);
        }

        sc.close();
    }
}