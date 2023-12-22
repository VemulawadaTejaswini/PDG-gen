
import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt(); int d = stdIn.nextInt();
        int[][] x = new int[n][d];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < d; j++){
                x[i][j] = stdIn.nextInt();
            }
        }

        int count = 0;
        double t = 0;
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; i + j + 1 < n; j++){
                for(int k = 0; k < d; k++){
                     t += Math.pow(x[i][k] - x[i + j + 1][k], 2);
                }
                if(Math.pow((int)Math.sqrt(t), 2) == t) count++;
                t = 0;
            }
        }

        System.out.println(count);
    }
}