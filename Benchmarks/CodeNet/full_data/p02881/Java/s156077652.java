import java.util.Scanner;
public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		long N = sc.nextLong();
      	long Min = 0;
      	long Max = 0;
        long i;
      
      	long M = (long) Math.sqrt(N);
      
      	for (i = 0; i <= N - M; i++){
      		if (N % (M + i) == 0) {
            	Max = M + i;
                break;
            }
      	}
      
      	for (i = 0; i <= M; i++){
      		if (N % (M - i) == 0) {
            	Min = M - i;
                break;
            }
      	}
      
      	Max = ((N / Max) + Max -2);
        Min = ((N / Min) + Min -2);

		if (Max < Min) {
        	System.out.print(Max);
        } else {
        	System.out.print(Min);
        }
      		
	return;

	}
}