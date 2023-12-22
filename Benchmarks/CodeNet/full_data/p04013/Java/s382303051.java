import java.util.*;

class Main {

	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ans = scan.nextInt();
		int x[] = new int[n];
		
		int sum = 0;
		int ave = 0;
		long count =0;
		
		for(int i = 0; i < n; i++)
			x[i] = scan.nextInt();
		
		for(int i =0; i < (int)Math.pow(2, n); i++){
			for(int j = 0; j < n; j++){
				if((1 & i >> j)== 1){
					sum += x[j];
					ave += ans;
				}
			}
			if(sum == ave && ave !=0 )count++;
			sum = 0; ave=0;
		}
		System.out.print(count);
		
	}

}