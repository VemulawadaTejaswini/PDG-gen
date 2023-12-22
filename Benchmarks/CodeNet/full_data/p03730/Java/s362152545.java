import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt();
		int p = 0;
		for(int i = 1; i < B; i++) {
			if(A * i % B == C) {
				System.out.println("YES"); 
				p = 1; 
				break;
			}
		}
		if(p == 0)System.out.println("NO");
	}

}
