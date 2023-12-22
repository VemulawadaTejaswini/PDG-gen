import java.util.Scanner;

public class Main{
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		
		
		int count = 0;
		
		
		for(int i = 1;i<=B;i++){
			if(A*i%B==C){
				count =1;
			}
			
		}
		
		
		System.out.println(count==1?"YES":"NO");
		
		
		
	}

}
