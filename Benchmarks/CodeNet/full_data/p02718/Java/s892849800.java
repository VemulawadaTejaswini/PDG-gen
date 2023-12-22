import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();
        int M = stdIn.nextInt();
        int sum_M =0;

        int[] A = new int[N];
        int sum = 0;
        for (int i=0; i<A.length; i++){
            A[i] = stdIn.nextInt();
            sum += A[i];
        }

        Arrays.sort(A);

        if((long)A[N-M] >= (long)(sum/(4*M)) ){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }




    }
}