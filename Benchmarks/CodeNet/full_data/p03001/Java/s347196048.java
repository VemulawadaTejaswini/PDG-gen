import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);


		int w = stdIn.nextInt();
		int h = stdIn.nextInt();
		int x = stdIn.nextInt();
		int y = stdIn.nextInt();


		System.out.print(w*(long)h/2.0+" ");
		if(x*2 == w && y * 2 == h) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}



	}

}
