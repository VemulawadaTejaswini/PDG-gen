import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	void doIt() {
		int x = sc.nextInt();
		if(x == 3 || x == 5 || x == 7)System.out.println("YES");
		else System.out.println("NO"); 
	
	}
	Main(){doIt();}
	public static void main(String[] args) {
		new Main();
	}

}
