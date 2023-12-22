import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int D = scan.nextInt();
        int[][] X = new int[N][D];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < D; j++) {
                X[i][j] = scan.nextInt();
            }
        }
        double distance = 0.0;
        int count=0;
        for (int i = 0; i < N; i++) {
          for (int k = i+1; k < N; k++) {
            distance = 0.0;
            for (int j = 0; j < D; j++) {
                    distance += Math.pow(Math.abs(X[i][j] - X[k][j]),2.0);
                }            
            	int distanceT= (int)Math.sqrt(distance);
            	if (distance==Math.pow(distanceT,2.0)) {
               		count++;
            	}
            }
        }
        System.out.println(count);
    }
}