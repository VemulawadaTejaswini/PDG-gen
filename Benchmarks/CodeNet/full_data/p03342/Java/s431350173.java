
import java.util.Scanner;

class Solver{
	Scanner sc =new Scanner(System.in);
	
	void run(){
		
		int n = sc.nextInt();	
		int a[] = new int[n];
	
		for(int i =0 ; i < n ; i++){
			a[i] = sc.nextInt();
		}
		
		
		int l = 0;
		int r = 0;
		
		int sum = 0;
		
		long res = 0;
		
		for(;;){
//			System.out.println(l+" "+r+" "+sum);
			if((sum & a[r]) == 0){
				
				sum |= a[r];
				r++;
				
				res += r-l;
				if(r >= n){
					break;
				}
				
			}else{
				
				sum -= a[l];
				l++;
			}
		}
		
		System.out.println(res);
		
	}
}

public class Main {
	public static void main(String[] args){
		Solver s  = new Solver();
		s.run();
	}
}
