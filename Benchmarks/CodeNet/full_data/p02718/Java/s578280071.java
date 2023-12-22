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

        //double AAA = A[N-M];
        //double BBB = (double)sum/4*(double)M;
        //System.out.println("\n"+AAA+"\n"+BBB+"\n"+(AAA-BBB));
        if(AAA < BBB ){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }




    }
}