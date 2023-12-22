import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int h = stdIn.nextInt(); //縦
		int w = stdIn.nextInt(); //横
		String[] pic = new String[2*h];
		
		for(int i = 0; i < h; i++) {
			pic[i] = stdIn.next();
		}
		
		
		for(int i = 0; i < h; i++) {
			System.out.println(pic[i]);
			System.out.println(pic[i]);
		}
	}

}
