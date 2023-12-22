import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		int C = Integer.parseInt(sc.next());
		int D = Integer.parseInt(sc.next());
		sc.close();

		int time = 0;
		for(int i = 1; i <= 100; i++) {
			if(A <= i && i <= B) {
				if(C <= i && i <= D) {
					time++;
				}
			}
		}
		System.out.println(time == 0 ? time : time - 1);
	}

}