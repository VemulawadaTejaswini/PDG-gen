import java.util.*;
public class Main {
	public static void main(String[] args){
		//Scanner sc = new Scanner(System.in);
		//int N = sc.nextInt();
		int N = Integer.parseInt(args[0]);
		String s = String.valueOf(N);
		int F = 0;
		for (int i = 0; i < s.length(); i++) {
			F = F + Integer.parseInt(s.substring(i, i+1));
		}
		
		if (N % F == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
