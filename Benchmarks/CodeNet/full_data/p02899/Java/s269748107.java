import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] A = new int[N];

        for(int i=0; i < N; i++){
            A[i] = sc.nextInt();
        }

        int count = 1;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(A[j] == count){
                    System.out.println(j+1);
                }
            }
            count += 1;
        }
    }
}