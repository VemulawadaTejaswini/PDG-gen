import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {
		
		int n = sc.nextInt();
		
		int a[] = new int[n];
		int b[] = new int[n];

		
		for(int i = 0; i < n ; i++){
			a[i] = sc.nextInt();
		}
		for(int i = 0; i < n ; i++){
			b[i] = sc.nextInt();
		}
		
		int ba = 0;
		int ab = 0;

		for(int i =0 ; i < n ;i++){
			if( b[i] > a[i] ){
				ba += (b[i]-a[i])/2 ;
			}else{
				ab += (a[i]-b[i]);
			}
		}	
					
		System.out.println(ab <= ba ?"Yes":"No");
	}
}
