
import java.util.Scanner;

class Solver{
	Scanner sc =new Scanner(System.in);
	
	
	void run(){
		int n = sc.nextInt();
		
		int[] ans = new int[n];
		int count = 64;
		ans[0] = 2;
		ans[1] = 5;
		ans[2] = 63;
		
		int sum = 70;
		for(int i = 3;i < n-1; i++){
			for(;count % 2 != 0 && count % 5 != 0 && count % 3 != 0;count++){}
			ans[i] = count;
			sum += count;
			sum %=30;
			count++;
		}
		
		if(n > 3){	
			for(;(count % 2 != 0 && count % 5 != 0 && count % 3 != 0) || (count+sum)%30 != 0;count++);
			ans[n-1] = count;
		}
		long mysum = 0;
		for(int i = 0;i < n-1; i++){
			System.out.print(ans[i]);
			System.out.print(" ");
			mysum += ans[i];
//			System.out.println();
		}
		System.out.println(ans[n-1]);
//		System.out.println(mysum+ans[n-1]);
		
	}
}

public class Main {
	public static void main(String[] args){
		Solver s  = new Solver();
		s.run();
	}
}

