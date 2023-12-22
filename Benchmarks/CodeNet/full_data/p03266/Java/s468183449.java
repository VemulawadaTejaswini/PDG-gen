import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		
		if (N<=0 || K<0 || K>2*Math.pow(10,5)){
			System.out.println("error");
		}
		else
		{
			if(K%2==1){
				System.out.println((int)Math.pow(N/(K/2),3));
			}
			else{
				System.out.println((int)Math.pow(N/K,3));
				
			}
			
		}
		
	}

}