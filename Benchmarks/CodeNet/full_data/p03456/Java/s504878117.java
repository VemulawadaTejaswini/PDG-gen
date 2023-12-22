
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	boolean[] table ;
	{
		table = new boolean[100101];
		for(int i = 0; i * i <= 100100; i++){
			table[i*i] = true;
		}
	}
	
	void run() {
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		
		System.out.println(table[Integer.valueOf(String.valueOf(a)+String.valueOf(b))]?"Yes":"No");
		

	}
}
