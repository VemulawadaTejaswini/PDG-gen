
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner cin = new Scanner(System.in);
    int N= cin.nextInt();
    int[] A =new int[N];
    int[] B = new int[N];
    for(int i =0;i<N;i++)
    {
        A[i] = cin.nextInt();
        B[i] = cin.nextInt();
    }
    int i=0;
    do {
        if(A[i+1]+B[i+1]>A[i]+B[i] ) {
            System.out.println(A[i]+B[i]);
            return;
        }
        else if(i+1==N-1)
        {
            System.out.println(A[i+1]+B[i+1]);
            return;
        }
        else i++;

    }while (i<N-1);


    }
}
