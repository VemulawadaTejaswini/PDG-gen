
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(), T = in.nextInt();
        int cost = Integer.MAX_VALUE;
        for(int i = 0; i < N; i++){
            int c = in.nextInt(), t = in.nextInt();
            if(t <= T){
                cost = Math.min(cost, c);
            }
        }
        if(cost == Integer.MAX_VALUE){
            System.out.println("TLE");
        }
        else{
            System.out.println(cost);
        }
    }
}
