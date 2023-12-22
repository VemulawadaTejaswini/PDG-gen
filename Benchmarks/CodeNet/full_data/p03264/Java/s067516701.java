import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int K = scan.nextInt();
		
		if (K==1){
			
			System.out.println(0);
		}
		else{
			int even;
			int odd;
			if (K%2==0){
				even = K/2;
				odd = K/2;	
			}
			else{
				even = K/2;
				odd = K/2 + 1;
				
			}		
			System.out.println(even*odd);
			
		}
		
	}
}