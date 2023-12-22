import java.util.Arrays;
import java.util.Scanner;

class Solver{
	Scanner sc =new Scanner(System.in);
	
	void run(){
		
		int n = sc.nextInt();
		int a[] = new int[n];
		
		for(int i =0 ; i < n ; i++){
			a[i] = sc.nextInt();
		}
		
		Arrays.sort(a);
		int t = a[n-1];
		int minMax = 0;
		int u = 0;
		for(int i = 0 ; i < n;i++){
			if(minMax < Math.min(a[i],t-a[i])){
				minMax = Math.min(a[i],t-a[i]);
				u = i;
			};
		}
		
		System.out.println(t+" "+a[u]);
		
		
	}
}

public class Main {
	public static void main(String[] args){
		Solver s  = new Solver();
		s.run();
	}
}

