import java.util.*;
 
public class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[][] t = new int[3][N+1];
        t[0][0] = 0;
        t[1][0] = 0;
        t[2][0] = 0;

        for(int i = 1; i <= N; i++){
            t[0][i] = sc.nextInt();
            t[1][i] = sc.nextInt();
            t[2][i] = sc.nextInt();
        }
        sc.close();

        for(int i = 1; i <= N; i++){
            if(t[0][i] - t[0][i-1] < Math.abs(t[1][i] - t[1][i-1]) +
                                    Math.abs(t[2][i] - t[2][i-1])){
                System.out.println("No");
                return;
            } else if((t[0][i] - t[0][i-1]) % 2 != (Math.abs(t[1][i] - t[1][i-1]) +
                                                    Math.abs(t[2][i] - t[2][i-1])) % 2){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}