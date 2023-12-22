import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int N, i, j, count = 0;
        int A[] = new int[1500];
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        for(i=0; i<N; i++){
            A[i] = scan.nextInt();
        }
        for(i=0; i<N-1; i++){
            for(j=1; j<N-i; j++){
                count = count+(A[i]^A[i+j]);
            }
        }
        System.out.println(count);
    }
}
