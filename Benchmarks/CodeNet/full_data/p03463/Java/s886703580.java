
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Main m = new Main();
		m.run();
	}
	
	Scanner sc = new Scanner(System.in);
	
	void run(){
		int a = sc.nextInt();
		int b = sc.nextInt();
		
//		Alice、ボリスが勝つ場合は Borys、どちらも勝つことができないなら 'Draw'
		
		if(Math.abs(a-b )%2 ==0 ){
			System.out.println("Alice");
		}else{
			System.out.println("Borys");
		}
		
	}
}
