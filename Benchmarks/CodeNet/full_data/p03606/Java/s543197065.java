import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		int[] l = new int[N];
		int[] r = new int[N];
		int[] D = new int[N];
		int goukei = 0;
		
		for(int i = 0;i<N;i++){
			
			l[i] = scan.nextInt();
			r[i] = scan.nextInt();
			
			D[i] = r[i]-l[i]+1;
			
			goukei+=D[i];
			
			
		}
		
		System.out.println(goukei);
		
		
		
		
		
		
		
		
		
		
	}

}
