import java.util.Scanner;

public class Main {
    static Scanner stdIn = new Scanner(System.in);
    public static void main(String[] args){
        int n = stdIn.nextInt();
        int d = stdIn.nextInt();
        int[][] x = new int[n][d];
        for(int i=0; i<n; i++){
            for(int j=0; j<d; j++){
                x[i][j] = stdIn.nextInt();
            }
        }

        int cnt = 0;
        int dist = 0;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                dist = 0;
                for(int k=0; k<d; k++){
                    dist += (x[i][k] - x[j][k]) * (x[i][k] - x[j][k]);
                }
                if(isSquareNumber(dist)){
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
    
    static boolean isSquareNumber(int n){
        double sqrtN = Math.sqrt(n);
        for(int i=0; i<=sqrtN; i++){
            if(i * i == n){
                return true;
            }
        }
        return false;
    }
}
