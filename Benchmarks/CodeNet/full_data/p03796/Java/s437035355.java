import java.util.Scanner;

class Main{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		int j = 1;

		sc.close();

		while(j<=n){
			i = i*j;
			j = j+1;
		}	
		
		System.out.print(i%1000000007);
	}
}