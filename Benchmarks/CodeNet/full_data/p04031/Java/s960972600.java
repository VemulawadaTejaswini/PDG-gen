import java.util.Scanner;

class Main {

	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x[] = new int[n];
		int low = 100,high = -100;
		for(int i =0 ; i < n; i++){
			x[i] =  scan.nextInt();
			if(x[i] >= high)high = x[i];
			if(x[i] <= low)low = x[i];
		}
		
		int cost, min = 10000000;
		for(int i = low; i <= high; i++){
			cost = 0;
			for(int j = 0; j < n; j++){
				cost += (x[j] - i)*(x[j] - i);
			}
			if(cost <= min )min = cost;
		}
		System.out.print(min);
	}

}
