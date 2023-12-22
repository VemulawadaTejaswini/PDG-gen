import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		int yonbai=0,kisuu=0;
		
		for(int i=0; i<n; i++){
			int a = sc.nextInt();
			if(a % 4 == 0){
				yonbai++;
			}
			else if(a % 2 != 0){
				kisuu++;
			}
		}
		
		if(yonbai >= kisuu - 1){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
}