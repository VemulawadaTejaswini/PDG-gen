import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	 	Scanner sc = new Scanner(System.in);
	 	int A = sc.nextInt();
	 	int B = sc.nextInt();
	 	int C = sc.nextInt();
	 	int D = sc.nextInt();
	 	int time = 0;

	 	if(Math.max(A,C) <= Math.min(B,D)) {
	 		time = Math.min(B,D) - Math.max(A,C);
	 	}

	 	System.out.println(time);
	 }
}
