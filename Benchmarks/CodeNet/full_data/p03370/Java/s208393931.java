import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int minCost = 1000;
        for (int l = 0; l < N; l++) {
            int m = sc.nextInt();
            minCost = Math.min(minCost,m);
            X -=m;
        }
        System.out.println(N+(X/minCost));
    }
}
