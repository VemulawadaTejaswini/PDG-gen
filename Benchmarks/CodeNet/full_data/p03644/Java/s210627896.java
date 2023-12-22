import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());
		for (int i=0; i<10; i++){
			if (Math.pow(2, i) > N){
				System.out.println((int)Math.pow(2, i-1));
				return;
			}
		}
	}
}