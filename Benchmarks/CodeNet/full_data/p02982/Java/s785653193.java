import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int d = sc.nextInt();
        
        int[][] x = new int[n][d];
        for(int a = 0; a < n; a++){
            for(int b = 0; b < d; b++){
                x[a][b] = sc.nextInt();
            }
        }
        
        int ans = 0;
        for(int a = 0; a < n-1; a++){
            for(int c = 1; c < n-a; c++){
                double distance = 0;
                for(int b = 0; b < d; b++){
                    distance += (x[a][b] - x[a+c][b]) * (x[a][b] - x[a+c][b]);
                }
                distance = Math.sqrt(distance);
                if(distance == Math.floor(distance)){
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}