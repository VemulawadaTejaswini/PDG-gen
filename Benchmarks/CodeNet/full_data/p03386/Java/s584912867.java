import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int A = scan.nextInt();
	int B = scan.nextInt();
	int K = scan.nextInt();

	for(int i = 0; i < K; i++){
	    if(A+i < (A+B)/2){
		System.out.println(A+i);
	    }
	}

	for(int i = 1; i <= K; i++){
	    if(B-K+i >= (A+B)/2){
		System.out.println(B-K+i);
	    }
	}
    }
}
