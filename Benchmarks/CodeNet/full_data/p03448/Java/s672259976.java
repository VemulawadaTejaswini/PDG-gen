import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int x = sc.nextInt();
		
		int count = 0;
		
		for(int i = 0 ;i <= a; i++){
			for(int j = 0 ;j <= b; j++){
				if( i*500 + j*100 <= x && i*500 + j*100 + c*50 >= x){
//					System.out.println(i +" "+ j);
					count ++;
				}
			}
		}
		
		System.out.println(count);
		
	}
}
