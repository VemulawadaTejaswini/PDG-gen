import java.util.ArrayList;
import java.util.Scanner;

public class Main extends Thread implements Runnable {
	public static void main(String[] args) {

		Main main = new Main();
		main.run();
	}
		public void run() {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();

                if(A=<8){
                    if(B=<8){
                        		System.out.println(Yay!);
                                        return ;
                   }
                }

		
	}
}
