import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        int[] x = new int[N];
        int sum = 0;

        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
            if((i+1)%2 != 0){
                sum += A[i];
            }else{
                sum -= A[i];
            }
        }
        x[0] = sum;

        for(int i=1; i<N; i++){
            x[i] = 2*A[i-1] - x[i-1];
        }

        for(int i=0; i<N; i++){
            System.out.println(x[i]);
        }
    }
}