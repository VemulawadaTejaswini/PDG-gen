import java.io.InputStreamReader;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(new InputStreamReader(System.in))){
			int N = scan.nextInt();

			int[] a = new int[N];
			long min = 999999999;
			
			for(int i = 0; i<N; i++){
				a[i] = scan.nextInt();
			}
			
			for(int i = -100; i<=100; i++){
                                long cost=0;
				for(int j = 0; j<N; j++){
long temp = a[j] - i;
				        cost+=temp*temp;
			        }
if(min>cost){
min=cost;
}
			}
			System.out.print(min);;
		}
	}
}