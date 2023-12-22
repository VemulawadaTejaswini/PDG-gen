import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int T = scanner.nextInt();

        int cost = Integer.MAX_VALUE;

        for(int i=0; i<N; i++){
            int c = scanner.nextInt();
            int t = scanner.nextInt();

            if(t <= T){
                cost = Math.min(cost, c);
            }
        }

        if(cost != Integer.MAX_VALUE) {
            System.out.println(cost);
        }else{
            System.out.println("TLE");
        }
    }

}
