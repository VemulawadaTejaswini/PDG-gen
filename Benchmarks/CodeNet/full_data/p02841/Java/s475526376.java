import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int M1 = Integer.parseInt(sc.next());
			int D1 = Integer.parseInt(sc.next());
			int M2 = Integer.parseInt(sc.next());
			int D2 = Integer.parseInt(sc.next());
			if(M1 == M2) {
				System.out.println(0);
			}else {
				System.out.println(1);
			}
		}	
	}
}