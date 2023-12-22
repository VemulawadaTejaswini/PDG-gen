import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {
		char[] ch = sc.next().toCharArray();
		int w =sc.nextInt();
		
		for(int i =0 ; i < ch.length ; i+=w){
			System.out.print(ch[i]);
		}
		System.out.println();
		
	}
}
