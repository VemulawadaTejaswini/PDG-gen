import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int D = sc.nextInt();
        int[][] X = new int[N][D];
        
        int count = 0;

        for(int i = 0; i < N; i++){
            for(int j = 0; j < D; j++){
                X[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < N-1; i++){
            for(int j = i+1; j < N; j++){
                double distance = 0;
                int diff = 0;
                for(int k = 0; k<D; k++){
                    diff = X[i][k]-X[j][k];
                    distance += diff*diff;
                }
                if(Math.sqrt(distance) % 1==0){
                    count += 1;
                }
            }
        }
        System.out.println(count);
    }
}