import java.util.Scanner;
import java.util.Arrays;

public class Main {

public static void main(String [] args){

        int N;
        int count =0;
        int Max =0;
        Scanner input = new Scanner(System.in);

        N = input.nextInt();
        int [][] arr = new int[2][N+1];
        arr[0][0] =0;
        arr[1][0] =0;

        for (int i=1; i<=N; i++ ) {
                arr[0][i] = input.nextInt();
        }
        for (int i=1; i<=N; i++ ) {
                arr[1][i] = input.nextInt();
                count += arr[1][i];
        }

        for (int i=1; i<=N; i++ ) {
                count = count + arr[0][i] - arr[1][i-1];
                if (count > Max) {
                        Max = count;
                }
        }
        System.out.println(Max);
}
}
