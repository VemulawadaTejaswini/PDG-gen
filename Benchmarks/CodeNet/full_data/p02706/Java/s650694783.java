import java.util.Scanner;

public class Main{
  	public static void main(String[] args){
  		Scanner sc = new Scanner(System.in);
  		int N = sc.nextInt();
  		int M = sc.nextInt();
  		int sum = 0;
  		for(int i = 0; i < M; i++){
  	    	int A = sc.nextInt();
  	    	sum += A;
    	}
  		int freeDays = N - sum;
  		if(freeDays < 0){
  	    	freeDays = -1;
    	}
  		System.out.println(freeDays);
    }
}