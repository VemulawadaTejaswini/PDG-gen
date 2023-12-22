import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int P = sc.nextInt();
		int S = 0;
		
		P = P + A * 3;
		if(P%2==1)
			S = (P - 1) / 2;
		else
			S = P /2;
	
		System.out.println(S);
	}
}