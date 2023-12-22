import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] X = new int[N];
        for(int i = 0;i<N;i++){
            X[i] = sc.nextInt();
        }

        int[] Y = new int[N];
        for(int i = 0;i<N;i++){
            for(int j = 0;j<N;j++){
                if(i == j){
                    continue;
                }else{
                    Y[j] = X[j];
                }
            }
            Arrays.sort(Y);
            // for(int k = 0;k<Y.length;k++){
            //     System.out.println(Y[k]);
            // }
            System.out.println(Y[(Y.length)/2]);
            for(int k = 0;k<Y.length;k++){
                Y[k] = 0;
            }
        }
    }
}