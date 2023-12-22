
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int N = Input.nextInt();
        int A[] = new int[N];
        for (int I = 0; I < N; I++) {
            A[I] = Input.nextInt();
        }
        
        int M = Input.nextInt();
        for (int I = 0; I < M; I++) {
            int Sum=0;
            int P1 = Input.nextInt();
            int X1 = Input.nextInt();

            for (int J = 0; J < N; J++) {
                if (J == P1 - 1) {
                    Sum+=X1;               
                }else{
                Sum+=A[J];}
            }
            System.out.println(Sum);

        }
    }
}
