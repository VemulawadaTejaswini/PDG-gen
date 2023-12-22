import java.util.Scanner;

class Main {

	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x[] = new int[n];
		for(int i =0 ; i < n; i++){
			x[i] =  scan.nextInt();
		}
		double ave = 0;
		for(int i : x){
			ave += i;
		}
		
		ave /= n;
		int A = (int)Math.ceil(ave);
		int cost, min = 900000;
		for(int i = -10; i <= 10; i++){
			cost = 0;
			for(int j = 0; j < n; j++){
				cost += (int)Math.pow((x[j] - (A+i)),2);
			}
			if(cost < min )min = cost;
		}
		System.out.print(min);
	}

}
