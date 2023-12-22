import java.util.Scanner;

class Main {

	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		int price = 0;
		
		for(int i = 1; i <= n; i++){
			if(i <= k)price += x;
			else price += y;
		}
		System.out.print(price);
	}

}