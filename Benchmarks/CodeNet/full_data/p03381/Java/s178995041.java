
import java.util.Arrays;
import java.util.Scanner;

class Solver{
	Scanner sc =new Scanner(System.in);
	
	void run(){
		
		int n = sc.nextInt();
		
		int a[] = new int[n];
		int b[] = new int[n];
		for(int i = 0; i < n ; i++){
			a[i] = sc.nextInt();
			b[i] = a[i];
		}
		
		Arrays.sort(b);
//		System.out.println(Arrays.toString(b));
		for(int i =0 ; i < n ;i++){
			if(a[i] >= b[n/2]){
//				System.out.println("::"+a[i]);
				System.out.println(b[n/2-1]);
			}else{
				System.out.println(b[n/2]);
			}			
		}
	}
}

public class Main {
	public static void main(String[] args){
		Solver s  = new Solver();
		s.run();
	}
}

