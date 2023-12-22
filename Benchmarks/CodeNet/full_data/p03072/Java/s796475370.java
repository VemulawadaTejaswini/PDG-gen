package atcoder;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt ();
		int[] H = new int[N];
		int sum =0;
		for(int i=0;i<N;i++){
		H[i]= scan.nextInt();
		}
		for(int i=0;i<N;i++){
		if(H[i]>H[i-1]){
			
			sum = sum+1;
		}
		
		System.out.println(sum);
		}
		
}
}