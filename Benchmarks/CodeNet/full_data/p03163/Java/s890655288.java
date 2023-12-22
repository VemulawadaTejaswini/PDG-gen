import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = scanner.nextInt();
        int w = scanner.nextInt();
        int[][] input = new int[n][2];
        for(int i = 0; i < n; i++){
            input[i][0] = scanner.nextInt();
            input[i][1] = scanner.nextInt();
        }
        long[][] knap = new long[n][w + 1];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < w + 1; j++){
                if(j == 0){
                    knap[i][j] = 0;
                }
                else {
                    if(j - input[i][0] >= 0){
                        if(i != 0){
                            knap[i][j] = Math.max(input[i][1] + knap[i - 1][j - input[i][0]], knap[i - 1][j]);
                        }
                        else {
                            knap[i][j] = input[i][1];
                        }
                    }
                    else if(i != 0) {
                        knap[i][j] = knap[i - 1][j];
                    }
                    else {
                        knap[i][j] = 0;
                    }
                }
            }
        }

        System.out.println(knap[n - 1][w]);

    }
}
