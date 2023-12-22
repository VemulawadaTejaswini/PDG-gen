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
		
		long sum = 0;
		for(int i = 3;i < n-1; i++){
			for(;count % 2 != 0 && count % 5 != 0 && count % 3 != 0;count++){}
			ans[i] = count;
			sum += count;
			count++;
		}
		
		if(n > 3){
			ans[n-1] = (count / 30 + 2) * 30 - (int)(sum%30);
		}
		for(int i = 0;i < n-1; i++){
			System.out.print(ans[i]);
			System.out.print(" ");
		}
		System.out.println(ans[n-1]);

		
	}
}

public class Main {
	public static void main(String[] args){
		Solver s  = new Solver();
		s.run();
	}
}

